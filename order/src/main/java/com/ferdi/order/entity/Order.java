/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferdi.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author manusiahiu
 */

@Table (name = "t_order")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderId;
    private int jumlah;
    private String tanggal;
    private String status;
    private double total;
    
    public Order(){
    }

    public Order(Long id, Long orderId, int jumlah, String tanggal, String status, double total) {
        this.id = id;
        this.orderId = orderId;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
        this.status = status;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order{");
        sb.append("id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", jumlah=").append(jumlah);
        sb.append(", tanggal=").append(tanggal);
        sb.append(", status=").append(status);
        sb.append(", total=").append(total);
        sb.append('}');
        return sb.toString();
    }
    
}
