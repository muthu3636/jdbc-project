package com.example.miniProject.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.miniProject.Models.Product;
import com.example.miniProject.Services.ProductServices;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductServices productService; 
//	@GetMapping("/products")
//	public List <Map<String,Object>> getAllProduct(){
//		return Arrays.asList(Map.of("name","product 1","price",234),
//				Map.of("name","product 2","price",134));  
//	}
//	

	
	@GetMapping("/view")
	public List<Product> getAllProducts(){
		return productService.getAll();
		
	}
	
	
	
	@GetMapping("/category")
	
	public List <Map<String,Object>> getCategoryProducts(){
		return Arrays.asList(Map.of("name","product 1","price",12),
				Map.of("name","product 2","price",35));
	}
	
	
	
//	@GetMapping("/display")
//	public List <Map<String,Object>> getCategory(){
//		return Arrays.asList(Map.of("name","product 3","price",102),
//				Map.of("name","product 4","price",305));
//	}
//	
//	
//	
}
