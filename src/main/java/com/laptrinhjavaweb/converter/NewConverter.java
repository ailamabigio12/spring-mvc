package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;

@Component
public class NewConverter {

	public NewDTO toDTO(NewEntity newEntity) {
		NewDTO result = new NewDTO();
		result.setId(newEntity.getId());
		result.setTitle(newEntity.getTitle());
		result.setThumbnail(newEntity.getThumbnail());
		result.setShortDescription(newEntity.getShortDescription());
		result.setContent(newEntity.getContent());
		result.setCategoryCode(newEntity.getCategory().getCode());
		return result;
	}
	
	public NewEntity toEntity(NewDTO newDTO) {
		NewEntity result = new NewEntity();
		result.setTitle(newDTO.getTitle());
		result.setThumbnail(newDTO.getThumbnail());
		result.setShortDescription(newDTO.getShortDescription());
		result.setContent(newDTO.getContent());
		return result;
	}
}
