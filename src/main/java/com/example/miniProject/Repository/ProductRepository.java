package com.example.miniProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.miniProject.Models.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
	
	
}