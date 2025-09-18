package com.SENA.SalesManagement.Sale.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.SENA.SalesManagement.Sale.Entity.Invoice;
import com.SENA.SalesManagement.Sale.Iservice.IInvoiceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/sale/invoices")
@Tag(name = "Invoice", description = "Invoice management APIs")
public class InvoiceController {

    @Autowired
    private IInvoiceService service;

    @GetMapping
    @Operation(summary = "Get all invoices", description = "Retrieve a list of all invoices")
    public List<Invoice> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get invoice by ID", description = "Retrieve a specific invoice by its ID")
    public Invoice findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new invoice", description = "Create a new invoice in the system")
    public Invoice save(@RequestBody Invoice invoice) {
        return service.save(invoice);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete invoice by ID", description = "Delete a specific invoice by its ID")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}