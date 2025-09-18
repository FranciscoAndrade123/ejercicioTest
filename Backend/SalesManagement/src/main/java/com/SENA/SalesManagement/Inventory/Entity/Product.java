package com.SENA.SalesManagement.Inventory.Entity;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "product", schema = "inventory")
@Schema(description = "Product entity representing inventory products")
public class Product extends AInventoryBaseEntity {

    @Column(name = "price", nullable = false)
    @Schema(description = "Product price", example = "29.99")
    private Double price;

    @Column(name = "stock", nullable = false)
    @Schema(description = "Current stock quantity", example = "100")
    private Integer stock;

    @Column(name = "id_category", nullable = false)
    @Schema(description = "Category ID this product belongs to", example = "category-uuid")
    private String idCategory;

    // Getters and setters
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }
}