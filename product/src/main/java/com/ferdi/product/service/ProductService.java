/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferdi.product.service;

import com.ferdi.product.entity.Product;
import com.ferdi.product.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author manusiahiu
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getAll(){
        return productRepository.findAll();
    }
    
    public void insert(Product product){
        productRepository.save(product);
    }
    
}
