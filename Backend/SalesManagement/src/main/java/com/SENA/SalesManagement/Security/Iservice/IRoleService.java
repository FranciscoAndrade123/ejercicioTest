package com.SENA.SalesManagement.Security.Iservice;

import java.util.List;
import com.SENA.SalesManagement.Security.Entity.Role;

public interface IRoleService {

    List<Role> findAll();

    Role findById(String id);

    Role save(Role role);

    void delete(String id);
}