package com.SENA.SalesManagement.Sale.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "venta", schema = "sale")
@Schema(description = "Sale entity representing a sales transaction")
public class Sale extends ASaleBaseEntity {

    @Column(name = "fecha", nullable = false)
    @Schema(description = "Sale date and time", example = "2023-10-01T10:00:00")
    private LocalDateTime fecha;

    @Column(name = "total", nullable = false)
    @Schema(description = "Total amount of the sale", example = "150.00")
    private Double total;

    @Column(name = "id_cliente", nullable = false)
    @Schema(description = "Client ID associated with the sale", example = "client-uuid")
    private String idCliente;

    @Column(name = "id_usuario", nullable = false)
    @Schema(description = "User ID who made the sale", example = "user-uuid")
    private String idUsuario;

    // Getters and setters
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

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}
