package com.SENA.SalesManagement.Sale.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.SENA.SalesManagement.Sale.Entity.Client;
import com.SENA.SalesManagement.Sale.Irepository.IClientRepository;
import com.SENA.SalesManagement.Sale.Iservice.IClientService;

@Service
public class ClientService implements IClientService {

    @Autowired
    private IClientRepository repository;

    @Override
    public List<Client> findAll() {
        return repository.findAll();
    }

    @Override
    public Client findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Client save(Client client) {
        return repository.save(client);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}