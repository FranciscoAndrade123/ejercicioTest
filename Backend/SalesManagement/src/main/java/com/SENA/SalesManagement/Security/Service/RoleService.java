package com.SENA.SalesManagement.Security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.SENA.SalesManagement.Security.Entity.Role;
import com.SENA.SalesManagement.Security.Irepository.IRoleRepository;
import com.SENA.SalesManagement.Security.Iservice.IRoleService;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private IRoleRepository repository;

    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }

    @Override
    public Role findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Role save(Role role) {
        return repository.save(role);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}