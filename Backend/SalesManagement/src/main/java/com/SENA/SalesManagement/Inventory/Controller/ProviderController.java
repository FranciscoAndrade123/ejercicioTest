package com.SENA.SalesManagement.Inventory.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.SENA.SalesManagement.Inventory.Entity.Provider;
import com.SENA.SalesManagement.Inventory.Iservice.IProviderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/inventory/providers")
@Tag(name = "Provider", description = "Provider management APIs")
public class ProviderController {

    @Autowired
    private IProviderService service;

    @GetMapping
    @Operation(summary = "Get all providers", description = "Retrieve a list of all providers")
    public List<Provider> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get provider by ID", description = "Retrieve a specific provider by its ID")
    public Provider findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new provider", description = "Create a new provider in the system")
    public Provider save(@RequestBody Provider provider) {
        return service.save(provider);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete provider by ID", description = "Delete a specific provider by its ID")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}