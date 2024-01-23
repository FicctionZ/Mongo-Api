package com.edu.tecazuay.generic.service;

import java.util.List;

public interface GenericService<T> {

	List<T> findAll();
	T findById(String _id);
	T save(T entity);
	void delete(String _id);
	
}
