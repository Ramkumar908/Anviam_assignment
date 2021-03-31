package com.anviam.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anviam.web.model.Product;
import com.anviam.web.service.ProductService;

@RestController
public class ProductController {
	
	
	@Autowired
	ProductService productService;
	
	/*
	 * 
	 * To Save the product in db
	 */
	@RequestMapping(value="/saveProduct",method= {RequestMethod.GET,RequestMethod.POST})
	public Product saveProduct(@RequestBody Product product)
	{
		
		return  productService.saveProduct(product);
	}
	
	/*
	 * 
	 * To get all the saved Product
	 */
	@RequestMapping(value="/getProduct",method= {RequestMethod.GET,RequestMethod.POST})
	public List<Product> getProduct()
	{
		
		return  productService.getAllProduct();
	}

	/*
	 * To delete the product with given id
	 */
	@RequestMapping(value="/deleteById/{id}",method= {RequestMethod.GET,RequestMethod.POST})
	public String   deleteProductById(@PathVariable("id") int id)
	{
		if(productService.existProduct(id)!=true)
		{
			return "Product with given id is not exist";
		}
		String deleteproductstatus=productService.deleteProductById(id);
		
		return "Successfully delete the product By Given Id ";
	}
	
	/*
	 * 
	 * To update the product
	 */
	@RequestMapping(value="/updateById",method= {RequestMethod.GET,RequestMethod.POST})
	public Product UpdateProduct(@RequestBody Product product)
	{
		
		
		
		
		return productService.updateProductById(product);
	}
	

}
