package com.edu.tecazuay.generic.service.imp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.edu.tecazuay.generic.service.GenericService;
import com.edu.tecazuay.model.generic.repository.GenericRepository;

public class GenericServiceImp<T> implements GenericService<T> {

	@Autowired
	private GenericRepository<T> genericRepository;

	@Override
	@Transactional(readOnly = true)
	public List<T> findAll() {
		return genericRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public T findById(String id) {
		return genericRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found."));
	}

	@Override
	@Transactional
	public T save(T entity) {
		return genericRepository.save((T) entity);
	}

	@Override
	@Transactional
	public void delete(String _id) {
		genericRepository.deleteById(_id);
	}

}
