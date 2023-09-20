package com.ecommerce.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.entity.Products;
import com.ecommerce.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    @PostMapping(value = "/post")
    public ResponseEntity<Products> postProductData(@RequestBody Products product) {
        product = service.saveProduct(product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @GetMapping(value = "/findall")
    public ResponseEntity<List<Products>> findAllProducts() {
        List<Products> products = service.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Void> removeProduct(@RequestParam Long id) {
        service.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/put")
    public ResponseEntity<Products> update(@RequestBody Products product) {
        service.update(product, product.getProduct_id());
        return new ResponseEntity<>(product, HttpStatus.ACCEPTED);
    }
}
