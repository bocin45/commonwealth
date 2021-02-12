package com.example.demo.service;

import java.util.Collection;
import java.util.Optional;

public interface BaseService<T, ID> {

	Collection<T> findAll();

	Optional<T> findById(ID id);

	T save(T entity);
	
	void delete(T entity);

}
