package com.SENA.SalesManagement.Inventory.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.SENA.SalesManagement.Inventory.Entity.Provider;
import com.SENA.SalesManagement.Inventory.Irepository.IProviderRepository;
import com.SENA.SalesManagement.Inventory.Iservice.IProviderService;

@Service
public class ProviderService implements IProviderService {

    @Autowired
    private IProviderRepository repository;

    @Override
    public List<Provider> findAll() {
        return repository.findAll();
    }

    @Override
    public Provider findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Provider save(Provider provider) {
        return repository.save(provider);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}