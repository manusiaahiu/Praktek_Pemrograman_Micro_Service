/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ferdi.order.repository;

import com.ferdi.order.entity.Order;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author manusiahiu
 */

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

    public List<Order> findall();

    public List<Order> findall();
    
}