package com.SENA.SalesManagement.Sale.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.SENA.SalesManagement.Sale.Entity.Sale;
import com.SENA.SalesManagement.Sale.Irepository.ISaleRepository;
import com.SENA.SalesManagement.Sale.Iservice.ISaleService;

@Service
public class SaleService implements ISaleService {

    @Autowired
    private ISaleRepository repository;

    @Override
    public List<Sale> findAll() {
        return repository.findAll();
    }

    @Override
    public Sale findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Sale save(Sale sale) {
        return repository.save(sale);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}