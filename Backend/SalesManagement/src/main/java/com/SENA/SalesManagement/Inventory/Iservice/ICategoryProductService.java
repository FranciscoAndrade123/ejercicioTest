package com.SENA.SalesManagement.Inventory.Iservice;

import java.util.List;
import com.SENA.SalesManagement.Inventory.Entity.CategoryProduct;

public interface ICategoryProductService {

    List<CategoryProduct> findAll();

    CategoryProduct findById(String id);

    CategoryProduct save(CategoryProduct categoryProduct);

    void delete(String id);
}