package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.entity.CategoryEntity;

public interface ICategoryService {

	List<CategoryEntity> findAll();
}
