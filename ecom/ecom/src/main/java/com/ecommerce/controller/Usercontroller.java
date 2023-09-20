package com.ecommerce.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Products;
import com.ecommerce.entity.Userproduct;
import com.ecommerce.service.Userservice;


@RestController
@RequestMapping("/user")
public class Usercontroller {
    
    private Userservice service;

    public Usercontroller(Userservice service) {
        this.service = service;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Userproduct>> findAllProducts() {
        List<Userproduct> product = service.getAllProducts();
        return new ResponseEntity<List<Userproduct>>(product, HttpStatus.OK);
    }

//    @GetMapping("/products/{id}")
//    public ResponseEntity<Userproduct> getProductLimitedDetails(@PathVariable Long id) {
//        Userproduct userproduct = service.getProductNameAndPrice(id);
//        return new ResponseEntity<>(userproduct, HttpStatus.OK);
//    }
}
