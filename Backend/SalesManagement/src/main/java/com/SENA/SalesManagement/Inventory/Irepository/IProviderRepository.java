package com.SENA.SalesManagement.Inventory.Irepository;

import com.SENA.SalesManagement.Inventory.Entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProviderRepository extends JpaRepository<Provider, String> {
}