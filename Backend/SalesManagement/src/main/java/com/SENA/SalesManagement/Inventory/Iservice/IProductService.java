package com.SENA.SalesManagement.Inventory.Iservice;

import java.util.List;
import com.SENA.SalesManagement.Inventory.Entity.Product;

public interface IProductService {

    List<Product> findAll();

    Product findById(String id);

    Product save(Product product);

    void delete(String id);
}