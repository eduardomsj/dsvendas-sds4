package com.eduardojr.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardojr.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
