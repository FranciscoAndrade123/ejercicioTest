package com.SENA.SalesManagement.Security.Iservice;

import java.util.List;
import com.SENA.SalesManagement.Security.Entity.Permission;

public interface IPermissionService {

    List<Permission> findAll();

    Permission findById(String id);

    Permission save(Permission permission);

    void delete(String id);
}