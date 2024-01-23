package com.edu.tecazuay.model.generic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T> extends MongoRepository<T, String> {
	
}
