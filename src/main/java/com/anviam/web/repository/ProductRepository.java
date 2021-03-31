package com.anviam.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anviam.web.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
	@Query(value="delete  from product  where product_id= ?1",nativeQuery=true)
    public String deleteProductById(Integer id);
	
	@Query(value="select product  from product  where product_id= ?1",nativeQuery=true)
   public boolean findProductById(int id);

}
