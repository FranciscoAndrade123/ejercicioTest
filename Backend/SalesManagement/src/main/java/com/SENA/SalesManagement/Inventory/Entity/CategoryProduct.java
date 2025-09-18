package com.SENA.SalesManagement.Inventory.Entity;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "category_product", schema = "inventory")
@Schema(description = "Category Product entity representing product categories")
public class CategoryProduct extends AInventoryBaseEntity {
}