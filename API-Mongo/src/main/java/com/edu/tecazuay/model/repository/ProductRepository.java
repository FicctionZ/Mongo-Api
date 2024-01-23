package com.edu.tecazuay.model.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.edu.tecazuay.model.entity.Product;
import com.edu.tecazuay.model.generic.repository.GenericRepository;

@Repository
public interface ProductRepository extends GenericRepository<Product> {

	Optional<Product> findById(String id);
	
}
