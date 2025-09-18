package com.SENA.SalesManagement.Security.Irepository;

import com.SENA.SalesManagement.Security.Entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPermissionRepository extends JpaRepository<Permission, String> {
}