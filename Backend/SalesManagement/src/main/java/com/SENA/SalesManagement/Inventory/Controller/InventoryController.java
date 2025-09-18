package com.SENA.SalesManagement.Inventory.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.SENA.SalesManagement.Inventory.Entity.Inventory;
import com.SENA.SalesManagement.Inventory.Iservice.IInventoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/inventory/inventories")
@Tag(name = "Inventory", description = "Inventory management APIs")
public class InventoryController {

    @Autowired
    private IInventoryService service;

    @GetMapping
    @Operation(summary = "Get all inventory records", description = "Retrieve a list of all inventory records")
    public List<Inventory> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get inventory by ID", description = "Retrieve a specific inventory record by its ID")
    public Inventory findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new inventory record", description = "Create a new inventory record in the system")
    public Inventory save(@RequestBody Inventory inventory) {
        return service.save(inventory);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete inventory by ID", description = "Delete a specific inventory record by its ID")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}