package com.eduardojr.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardojr.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
