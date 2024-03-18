/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferdi.order.controller;

import com.ferdi.order.VO.ResponseTemplate;
import com.ferdi.order.entity.Order;
import com.ferdi.order.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author manusiahiu
 */

@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    
    @GetMapping
    public List<Order>getAll(){
        return orderService.getAll();
        
    }
    
    @PostMapping
    public void insert(@RequestBody Order order){
        orderService.insert(order);
    }
    @DeleteMapping(path = "{Id}")
    public void delete(@PathVariable("Id") Long Id){
        orderService.delete(Id);
    }
    
     @PutMapping(path = "{id}")
    public void update(@PathVariable("id")Long id,
            @RequestParam(required =false) String jumlah,
            @RequestParam(required =false) String tanggal,
            @RequestParam(required =false) String satuan)
           
    {
        orderService.update(id, jumlah, tanggal, satuan);
    }

    @GetMapping(path ="{Id}")
    public Order getOrderById(@PathVariable("Id")Long Id){
    return orderService.getOrderById(Id);
    }
    
    @GetMapping(path = "{/produk/{id}")
    public ResponseTemplate getOrderWithProdukById(@PathVariable("id") Long id){
        return orderService.getOrderWithProdukById(id);
    }
    
}