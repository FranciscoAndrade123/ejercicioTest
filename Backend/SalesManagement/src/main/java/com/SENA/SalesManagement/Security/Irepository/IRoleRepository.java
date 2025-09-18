package com.SENA.SalesManagement.Security.Irepository;

import com.SENA.SalesManagement.Security.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, String> {
}