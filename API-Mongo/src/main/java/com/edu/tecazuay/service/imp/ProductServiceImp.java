package com.edu.tecazuay.service.imp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.tecazuay.generic.service.imp.GenericServiceImp;
import com.edu.tecazuay.model.entity.Product;
import com.edu.tecazuay.model.repository.ProductRepository;

@Service
public class ProductServiceImp extends GenericServiceImp<Product> {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product save(Product entity) {
		return productRepository.save(entity);
	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

}
