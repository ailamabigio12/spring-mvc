package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;

@Component
public class CategoryConverter {

	public CategoryDTO toDTO(CategoryEntity categoryEntity) {
		CategoryDTO result = new CategoryDTO();
		result.setId(categoryEntity.getId());
		result.setName(categoryEntity.getName());
		result.setCode(categoryEntity.getCode());
		return result;
	}
	
	public CategoryEntity toEntity(CategoryDTO categoryDTO) {
		CategoryEntity result = new CategoryEntity();
		result.setName(categoryDTO.getName());
		result.setCode(categoryDTO.getCode());
		return result;
	}
}
