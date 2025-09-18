package com.SENA.SalesManagement.Sale.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.SENA.SalesManagement.Sale.Entity.Invoice;
import com.SENA.SalesManagement.Sale.Irepository.IInvoiceRepository;
import com.SENA.SalesManagement.Sale.Iservice.IInvoiceService;

@Service
public class InvoiceService implements IInvoiceService {

    @Autowired
    private IInvoiceRepository repository;

    @Override
    public List<Invoice> findAll() {
        return repository.findAll();
    }

    @Override
    public Invoice findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Invoice save(Invoice invoice) {
        return repository.save(invoice);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}