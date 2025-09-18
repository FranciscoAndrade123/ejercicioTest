package com.SENA.SalesManagement.Inventory.Iservice;

import java.util.List;
import com.SENA.SalesManagement.Inventory.Entity.Provider;

public interface IProviderService {

    List<Provider> findAll();

    Provider findById(String id);

    Provider save(Provider provider);

    void delete(String id);
}