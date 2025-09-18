package com.SENA.SalesManagement.Sale.Irepository;

import com.SENA.SalesManagement.Sale.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInvoiceRepository extends JpaRepository<Invoice, String> {
}