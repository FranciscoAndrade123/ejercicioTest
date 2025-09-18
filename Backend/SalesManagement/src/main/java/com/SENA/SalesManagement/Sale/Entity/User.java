package com.SENA.SalesManagement.Sale.Entity;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "usuario", schema = "sale")
@Schema(description = "User entity representing a system user")
public class User extends ASaleBaseEntity {

    @Column(name = "correo", nullable = false)
    @Schema(description = "User's email address", example = "user@example.com")
    private String correo;

    @Column(name = "contrasena", nullable = false)
    @Schema(description = "User's password", example = "password123")
    private String contrasena;

    @Column(name = "id_rol", nullable = false)
    @Schema(description = "User's role ID", example = "role-uuid")
    private String idRol;

    // Getters and setters
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }
}