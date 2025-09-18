package com.SENA.SalesManagement.Sale.Iservice;

import java.util.List;
import com.SENA.SalesManagement.Sale.Entity.Client;

public interface IClientService {

    List<Client> findAll();

    Client findById(String id);

    Client save(Client client);

    void delete(String id);
}