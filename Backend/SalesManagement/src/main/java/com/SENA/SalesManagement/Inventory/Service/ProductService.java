package com.SENA.SalesManagement.Inventory.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.SENA.SalesManagement.Inventory.Entity.Product;
import com.SENA.SalesManagement.Inventory.Irepository.IProductRepository;
import com.SENA.SalesManagement.Inventory.Iservice.IProductService;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository repository;

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}