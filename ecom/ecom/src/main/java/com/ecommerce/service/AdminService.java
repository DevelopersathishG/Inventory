package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Products;
import com.ecommerce.repository.AdminRepository;


@Service
public class AdminService {
    private final AdminRepository repository;

    public AdminService(AdminRepository repository) {
        this.repository = repository;
    }

    public Products saveProduct(Products product) {
        product = repository.save(product);
        return product;
    }


    public List<Products> getAllProducts() {
        return repository.findAll();
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    public void update(Products product, Long id) {
        repository.save(product);
    }
}