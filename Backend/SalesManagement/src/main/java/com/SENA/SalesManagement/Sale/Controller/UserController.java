package com.SENA.SalesManagement.Sale.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.SENA.SalesManagement.Sale.Entity.User;
import com.SENA.SalesManagement.Sale.Iservice.IUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/sale/users")
@Tag(name = "User", description = "User management APIs")
public class UserController {

    @Autowired
    private IUserService service;

    @GetMapping
    @Operation(summary = "Get all users", description = "Retrieve a list of all users")
    public List<User> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get user by ID", description = "Retrieve a specific user by its ID")
    public User findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new user", description = "Create a new user in the system")
    public User save(@RequestBody User user) {
        return service.save(user);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete user by ID", description = "Delete a specific user by its ID")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}