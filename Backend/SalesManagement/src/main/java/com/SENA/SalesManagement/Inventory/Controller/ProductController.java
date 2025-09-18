package com.SENA.SalesManagement.Inventory.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.SENA.SalesManagement.Inventory.Entity.Product;
import com.SENA.SalesManagement.Inventory.Iservice.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/inventory/products")
@Tag(name = "Product", description = "Product management APIs")
public class ProductController {

    @Autowired
    private IProductService service;

    @GetMapping
    @Operation(summary = "Get all products", description = "Retrieve a list of all products")
    public List<Product> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get product by ID", description = "Retrieve a specific product by its ID")
    public Product findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new product", description = "Create a new product in the system")
    public Product save(@RequestBody Product product) {
        return service.save(product);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete product by ID", description = "Delete a specific product by its ID")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}