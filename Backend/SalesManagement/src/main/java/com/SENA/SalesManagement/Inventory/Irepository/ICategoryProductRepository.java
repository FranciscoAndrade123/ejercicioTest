package com.SENA.SalesManagement.Inventory.Irepository;

import com.SENA.SalesManagement.Inventory.Entity.CategoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryProductRepository extends JpaRepository<CategoryProduct, String> {
}