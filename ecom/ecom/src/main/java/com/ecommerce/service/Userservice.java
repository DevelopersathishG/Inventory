package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Products;
import com.ecommerce.entity.Userproduct;
import com.ecommerce.repository.Userrepository;

@Service
public class Userservice {
      
	@Autowired
    private Userrepository repository;

    public Userservice(Userrepository repository) {
        this.repository = repository;
    }

//    public Userproduct getProductNameAndPrice(Long productId) {
//        return repository.findNameAndPriceById(productId);
//    }

    public List<Userproduct> getAllProducts() {
        List<Userproduct> products = repository.findAllLimitedDetails();
        return products;
    }
}

