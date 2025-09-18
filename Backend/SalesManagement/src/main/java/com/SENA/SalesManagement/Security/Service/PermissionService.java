package com.SENA.SalesManagement.Security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.SENA.SalesManagement.Security.Entity.Permission;
import com.SENA.SalesManagement.Security.Irepository.IPermissionRepository;
import com.SENA.SalesManagement.Security.Iservice.IPermissionService;

@Service
public class PermissionService implements IPermissionService {

    @Autowired
    private IPermissionRepository repository;

    @Override
    public List<Permission> findAll() {
        return repository.findAll();
    }

    @Override
    public Permission findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Permission save(Permission permission) {
        return repository.save(permission);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}