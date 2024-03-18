/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferdi.order.service;

import com.ferdi.order.VO.Product;
import com.ferdi.order.VO.ResponseTemplate;
import com.ferdi.order.entity.Order;
import com.ferdi.order.repository.OrderRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author manusiahiu
 */
@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;
    private int toral;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public List<Order> getAll(){
        return orderRepository.findAll();
    }
    
    public Order getOrderById(long id){
        return orderRepository.getReferenceById(id);
    }
    
    public void insert(Order order){
        orderRepository.save(order);
    }
    
    @Transactional
   public void update(Long id, Long orderId, Integer jumlah, String tanggal, String status, double total){
        Order order = orderRepository.findById(orderId)
                .orElseThrow(
                        () -> new IllegalStateException("Produk tidak ada")
                );
    
    if (jumlah != null) {
            order.setJumlah(jumlah);
        }
        if(tanggal != null && tanggal.length()>0
                && !Objects.equals(order.getTanggal(), tanggal)){
            order.setTanggal(tanggal);
        }
        if(status != null && status.length()>0
                && !Objects.equals(order.getStatus(), status)){
            order.setStatus(status);
        }       
   }
   public void delete(Long id){
        orderRepository.deleteById(id);
    }

    public void update(Long id, String jumlah, String tanggal, String satuan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public ResponseTemplate getOrderWithProdukById(Long id){
        ResponseTemplate responseTemplate = new ResponseTemplate();
        Order order = getOrderById(id);
        Product product = restTemplate.getForObject("http://localhost:9002/api/v1/produk"
                +order.getProductId(), Product.class);
        responseTemplate.setOrder(order);
        responseTemplate.setProduct(product);
        return responseTemplate;
    }
}
   
