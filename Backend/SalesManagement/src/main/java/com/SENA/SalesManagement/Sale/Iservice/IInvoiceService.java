package com.SENA.SalesManagement.Sale.Iservice;

import java.util.List;
import com.SENA.SalesManagement.Sale.Entity.Invoice;

public interface IInvoiceService {

    List<Invoice> findAll();

    Invoice findById(String id);

    Invoice save(Invoice invoice);

    void delete(String id);
}