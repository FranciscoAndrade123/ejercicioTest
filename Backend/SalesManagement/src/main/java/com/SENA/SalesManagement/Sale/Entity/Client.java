package com.SENA.SalesManagement.Sale.Entity;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "cliente", schema = "sale")
@Schema(description = "Client entity representing a customer")
public class Client extends ASaleBaseEntity {

    @Column(name = "apellido", nullable = false)
    @Schema(description = "Client's last name", example = "García")
    private String apellido;

    @Column(name = "correo", nullable = false)
    @Schema(description = "Client's email address", example = "client@example.com")
    private String correo;

    @Column(name = "telefono", nullable = false)
    @Schema(description = "Client's phone number", example = "+1234567890")
    private String telefono;

    // Getters and setters
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
