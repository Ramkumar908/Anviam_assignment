package com.anviam.web.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anviam.web.model.Product;
import com.anviam.web.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Product saveProduct(Product product) {
		
		
		return productRepository.save(product);
	}

	public List<Product> getAllProduct() {
		
		return productRepository.findAll();
	}

	public boolean existProduct(int id) {
		
		return productRepository.findProductById(id);
	}

	public String  deleteProductById(int id) {
		
		return productRepository.deleteProductById(id);
	}

	public Product updateProductById(Product product) {
		
		
		return productRepository.save(product);
		
		
	}

	

	
}
