package com.SENA.SalesManagement.Inventory.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.SENA.SalesManagement.Inventory.Entity.CategoryProduct;
import com.SENA.SalesManagement.Inventory.Irepository.ICategoryProductRepository;
import com.SENA.SalesManagement.Inventory.Iservice.ICategoryProductService;

@Service
public class CategoryProductService implements ICategoryProductService {

    @Autowired
    private ICategoryProductRepository repository;

    @Override
    public List<CategoryProduct> findAll() {
        return repository.findAll();
    }

    @Override
    public CategoryProduct findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public CategoryProduct save(CategoryProduct categoryProduct) {
        return repository.save(categoryProduct);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}