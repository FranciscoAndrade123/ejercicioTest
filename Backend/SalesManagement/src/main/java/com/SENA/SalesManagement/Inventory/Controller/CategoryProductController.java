package com.SENA.SalesManagement.Inventory.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.SENA.SalesManagement.Inventory.Entity.CategoryProduct;
import com.SENA.SalesManagement.Inventory.Iservice.ICategoryProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/inventory/category-products")
@Tag(name = "CategoryProduct", description = "Product category management APIs")
public class CategoryProductController {

    @Autowired
    private ICategoryProductService service;

    @GetMapping
    @Operation(summary = "Get all product categories", description = "Retrieve a list of all product categories")
    public List<CategoryProduct> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get product category by ID", description = "Retrieve a specific product category by its ID")
    public CategoryProduct findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new product category", description = "Create a new product category in the system")
    public CategoryProduct save(@RequestBody CategoryProduct categoryProduct) {
        return service.save(categoryProduct);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete product category by ID", description = "Delete a specific product category by its ID")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}