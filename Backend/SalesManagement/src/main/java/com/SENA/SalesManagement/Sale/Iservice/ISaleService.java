package com.SENA.SalesManagement.Sale.Iservice;

import java.util.List;
import com.SENA.SalesManagement.Sale.Entity.Sale;

public interface ISaleService {

    List<Sale> findAll();

    Sale findById(String id);

    Sale save(Sale sale);

    void delete(String id);
}