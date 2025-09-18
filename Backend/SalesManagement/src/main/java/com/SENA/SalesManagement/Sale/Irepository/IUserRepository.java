package com.SENA.SalesManagement.Sale.Irepository;

import com.SENA.SalesManagement.Sale.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, String> {
}