package com.SENA.SalesManagement.Security.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.SENA.SalesManagement.Security.Entity.Role;
import com.SENA.SalesManagement.Security.Iservice.IRoleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/security/roles")
@Tag(name = "Role", description = "Role management APIs")
public class RoleController {

    @Autowired
    private IRoleService service;

    @GetMapping
    @Operation(summary = "Get all roles", description = "Retrieve a list of all roles")
    public List<Role> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get role by ID", description = "Retrieve a specific role by its ID")
    public Role findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new role", description = "Create a new role in the system")
    public Role save(@RequestBody Role role) {
        return service.save(role);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete role by ID", description = "Delete a specific role by its ID")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}