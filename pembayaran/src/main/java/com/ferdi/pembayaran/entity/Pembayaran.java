/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferdi.pembayaran.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author USER
 */

@Entity
@Table

public class Pembayaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderId;
    private String modePembayaran;
    private String noReferensi;
    private String tglBayar;
    private double totalBayar;
    
    
    public Pembayaran(){
    }

    public Pembayaran(Long id, Long orderId, String modePembayaran, String noReferensi, String tglBayar, double totalBayar) {
        this.id = id;
        this.orderId = orderId;
        this.modePembayaran = modePembayaran;
        this.noReferensi = noReferensi;
        this.tglBayar = tglBayar;
        this.totalBayar = totalBayar;
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

    public String getModePembayaran() {
        return modePembayaran;
    }

    public void setModePembayaran(String modePembayaran) {
        this.modePembayaran = modePembayaran;
    }

    public String getNoReferensi() {
        return noReferensi;
    }

    public void setNoReferensi(String noReferensi) {
        this.noReferensi = noReferensi;
    }

    public String getTglBayar() {
        return tglBayar;
    }

    public void setTglBayar(String tglBayar) {
        this.tglBayar = tglBayar;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    @Override
    public String toString() {
        return "Pembayaran{" + "id=" + id + ", orderId=" + orderId + ", modePembayaran=" + modePembayaran + ", noReferensi=" + noReferensi + ", tglBayar=" + tglBayar + ", totalBayar=" + totalBayar + '}';
    }
    
}



