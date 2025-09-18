package com.SENA.SalesManagement.Security.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.SENA.SalesManagement.Security.Entity.Permission;
import com.SENA.SalesManagement.Security.Iservice.IPermissionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/security/permissions")
@Tag(name = "Permission", description = "Permission management APIs")
public class PermissionController {

    @Autowired
    private IPermissionService service;

    @GetMapping
    @Operation(summary = "Get all permissions", description = "Retrieve a list of all permissions")
    public List<Permission> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get permission by ID", description = "Retrieve a specific permission by its ID")
    public Permission findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new permission", description = "Create a new permission in the system")
    public Permission save(@RequestBody Permission permission) {
        return service.save(permission);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete permission by ID", description = "Delete a specific permission by its ID")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}