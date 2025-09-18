package com.SENA.SalesManagement.Security.Entity;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "permission", schema = "security")
@Schema(description = "Permission entity representing system permissions")
public class Permission extends ASecurityBaseEntity {

    @Column(name = "description", nullable = true, length = 255)
    @Schema(description = "Permission description", example = "Allows user to create products")
    private String description;

    @Column(name = "module", nullable = false)
    @Schema(description = "Module this permission belongs to", example = "SALE")
    private String module;

    @Column(name = "action", nullable = false)
    @Schema(description = "Action this permission allows", example = "CREATE")
    private String action;

    // Getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}