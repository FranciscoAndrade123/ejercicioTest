package com.SENA.SalesManagement.Inventory.Irepository;

import com.SENA.SalesManagement.Inventory.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInventoryRepository extends JpaRepository<Inventory, String> {
}