package com.example.miniProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.miniProject.Models.Product;
import com.example.miniProject.Repository.ProductRepository;
import org.springframework.data.domain.Sort;
@Service
public class ProductServices {
@Autowired
private ProductRepository productRepository;
public List<Product> getAll(){
	List<Product> products = productRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
	return products;
}
	
}
