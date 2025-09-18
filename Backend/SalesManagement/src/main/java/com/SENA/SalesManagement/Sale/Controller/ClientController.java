package com.SENA.SalesManagement.Sale.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.SENA.SalesManagement.Sale.Entity.Client;
import com.SENA.SalesManagement.Sale.Iservice.IClientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/sale/clients")
@Tag(name = "Client", description = "Client management APIs")
public class ClientController {

    @Autowired
    private IClientService service;

    @GetMapping
    @Operation(summary = "Get all clients", description = "Retrieve a list of all clients")
    public List<Client> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get client by ID", description = "Retrieve a specific client by its ID")
    public Client findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new client", description = "Create a new client in the system")
    public Client save(@RequestBody Client client) {
        return service.save(client);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete client by ID", description = "Delete a specific client by its ID")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}