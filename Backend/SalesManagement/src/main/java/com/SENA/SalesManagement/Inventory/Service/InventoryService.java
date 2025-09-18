package com.SENA.SalesManagement.Inventory.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.SENA.SalesManagement.Inventory.Entity.Inventory;
import com.SENA.SalesManagement.Inventory.Irepository.IInventoryRepository;
import com.SENA.SalesManagement.Inventory.Iservice.IInventoryService;

@Service
public class InventoryService implements IInventoryService {

    @Autowired
    private IInventoryRepository repository;

    @Override
    public List<Inventory> findAll() {
        return repository.findAll();
    }

    @Override
    public Inventory findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Inventory save(Inventory inventory) {
        return repository.save(inventory);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}