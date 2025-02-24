package com.howhow.ecommerce.model.entity;

import jakarta.persistence.*;

import lombok.Data;

import java.time.OffsetDateTime;

@Entity
@Table(name = "favorite_theme")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "complete_status")
    private String productName;

    @Column(name = "complete_status")
    private String category;

    private Integer price;
    private Integer stock;
    private String description;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    @Column(name = "last_modified_at")
    private OffsetDateTime lastModifiedAt;
}
