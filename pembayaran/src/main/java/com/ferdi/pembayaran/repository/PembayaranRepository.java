/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ferdi.pembayaran.repository;

import com.ferdi.pembayaran.entity.Pembayaran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */

@Repository
public interface PembayaranRepository extends JpaRepository<Pembayaran, Long>{
    
}
