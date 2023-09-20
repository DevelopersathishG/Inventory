package com.ecommerce.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Products;
import com.ecommerce.entity.Userproduct;

@Repository
public interface Userrepository extends JpaRepository<Products, Long> {
	
    @Query("SELECT p.product_name AS name, p.product_description AS description, p.category AS category, p.selling_price AS price FROM com.ecommerce.entity.Products p WHERE p.product_id = :productId")
    Userproduct findNameAndPriceById(Long productId);

 @Query("SELECT p.product_name AS name, p.product_description AS description, p.category AS category, p.selling_price AS price FROM com.ecommerce.entity.Products p")
    List<Userproduct> findAllLimitedDetails();
	
}




