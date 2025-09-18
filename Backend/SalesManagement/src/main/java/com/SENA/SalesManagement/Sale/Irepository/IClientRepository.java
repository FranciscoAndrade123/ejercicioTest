package com.SENA.SalesManagement.Sale.Irepository;

import com.SENA.SalesManagement.Sale.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client, String> {
}