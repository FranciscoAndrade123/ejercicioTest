package com.SENA.SalesManagement.Inventory.Entity;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "provider", schema = "inventory")
@Schema(description = "Provider entity representing product suppliers")
public class Provider extends AInventoryBaseEntity {

    @Column(name = "contact", nullable = false)
    @Schema(description = "Provider contact person", example = "María González")
    private String contact;

    @Column(name = "phone", nullable = false)
    @Schema(description = "Provider phone number", example = "+57 301 456 7890")
    private String phone;

    // Getters and setters
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}