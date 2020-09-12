package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.NewConverter;
import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.repository.CategoryRepository;
import com.laptrinhjavaweb.repository.NewRepository;
import com.laptrinhjavaweb.service.INewService;

@Service
public class NewService implements INewService{

	@Autowired
	private NewRepository newRepository;
	
	@Autowired
	private NewConverter newConverter;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<NewDTO> findAll(Pageable pageable) {
		List<NewDTO> models = new ArrayList<>();
		List<NewEntity> entities = newRepository.findAll(pageable).getContent();
		for (NewEntity item: entities) {
			NewDTO newmodel = newConverter.toDTO(item);
			models.add(newmodel);
		}
		return models;
	}

	@Override
	public int getTotalItem() {
		
		return (int) newRepository.count();
	}

	@Override
	public NewDTO findById(long id) {
		NewEntity newEntity = newRepository.findOne(id);
		return newConverter.toDTO(newEntity);
	}

	@Override
	@Transactional
	public NewDTO save(NewDTO savenew) {
		CategoryEntity category = categoryRepository.findOneByCode(savenew.getCategoryCode());
		NewEntity newEntity = new NewEntity();
		if (savenew.getId() != null) {
			NewEntity oldnew = newRepository.findOne(savenew.getId());
			oldnew.setCategory(category);
			newEntity = newConverter.toEntity(oldnew, savenew);
		}
		else {
			newEntity = newConverter.toEntity(savenew);
			newEntity.setCategory(category);
		}
		return newConverter.toDTO(newRepository.save(newEntity));
	}

	@Override
	@Transactional
	public void delete(long[] ids) {
		for (long id: ids) {
			newRepository.delete(id);
		}
	}
}
