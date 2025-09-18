package com.SENA.SalesManagement.Sale.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "factura", schema = "sale")
@Schema(description = "Invoice entity representing a sales invoice")
public class Invoice extends ASaleBaseEntity {

    @Column(name = "id_venta", nullable = false)
    @Schema(description = "Sale ID associated with the invoice", example = "sale-uuid")
    private String idVenta;

    @Column(name = "fecha", nullable = false)
    @Schema(description = "Invoice date and time", example = "2023-10-01T10:00:00")
    private LocalDateTime fecha;

    @Column(name = "total", nullable = false)
    @Schema(description = "Total amount of the invoice", example = "150.00")
    private Double total;

    // Getters and setters
    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}