package com.SENA.SalesManagement.Security.Entity;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "role", schema = "security")
@Schema(description = "Role entity representing user roles")
public class Role extends ASecurityBaseEntity {

    @Column(name = "description", nullable = true, length = 255)
    @Schema(description = "Role description", example = "Administrator role with full access")
    private String description;

    // Getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}