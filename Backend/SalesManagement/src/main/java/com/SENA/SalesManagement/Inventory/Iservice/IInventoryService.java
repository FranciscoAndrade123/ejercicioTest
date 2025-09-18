package com.SENA.SalesManagement.Inventory.Iservice;

import java.util.List;
import com.SENA.SalesManagement.Inventory.Entity.Inventory;

public interface IInventoryService {

    List<Inventory> findAll();

    Inventory findById(String id);

    Inventory save(Inventory inventory);

    void delete(String id);
}