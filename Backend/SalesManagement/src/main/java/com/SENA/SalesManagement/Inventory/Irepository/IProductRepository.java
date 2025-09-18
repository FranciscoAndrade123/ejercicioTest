package com.SENA.SalesManagement.Inventory.Irepository;

import com.SENA.SalesManagement.Inventory.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, String> {
}