package com.SENA.SalesManagement.Sale.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.SENA.SalesManagement.Sale.Entity.Sale;
import com.SENA.SalesManagement.Sale.Iservice.ISaleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/sale/sales")
@Tag(name = "Sale", description = "Sale management APIs")
public class SaleController {

    @Autowired
    private ISaleService service;

    @GetMapping
    @Operation(summary = "Get all sales", description = "Retrieve a list of all sales")
    public List<Sale> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get sale by ID", description = "Retrieve a specific sale by its ID")
    public Sale findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new sale", description = "Create a new sale in the system")
    public Sale save(@RequestBody Sale sale) {
        return service.save(sale);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete sale by ID", description = "Delete a specific sale by its ID")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}