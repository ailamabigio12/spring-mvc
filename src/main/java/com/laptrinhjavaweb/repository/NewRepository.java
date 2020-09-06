package com.laptrinhjavaweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {

	List<NewEntity> findAll();
}
