package com.SENA.SalesManagement.Sale.Irepository;

import com.SENA.SalesManagement.Sale.Entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleRepository extends JpaRepository<Sale, String> {
}