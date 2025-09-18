package com.SENA.SalesManagement.Inventory.Entity;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "inventory", schema = "inventory")
@Schema(description = "Inventory entity representing stock levels")
public class Inventory extends AInventoryBaseEntity {

    @Column(name = "id_product", nullable = false)
    @Schema(description = "Product ID this inventory record belongs to", example = "product-uuid")
    private String idProduct;

    @Column(name = "current_stock", nullable = false)
    @Schema(description = "Current stock quantity", example = "50")
    private Integer currentStock;

    @Column(name = "min_stock", nullable = false)
    @Schema(description = "Minimum stock threshold", example = "10")
    private Integer minStock;

    // Getters and setters
    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(Integer currentStock) {
        this.currentStock = currentStock;
    }

    public Integer getMinStock() {
        return minStock;
    }

    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }
}