package com.howhow.ecommerce.model.entity;

import com.howhow.ecommerce.constant.ProductCategoryEnum;

import jakarta.persistence.*;

import lombok.Data;

import java.time.OffsetDateTime;

@Entity
@Table(name = "product")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name", nullable = false, length = 128)
    private String productName;

    @Column(name = "category", nullable = false, length = 256)
    private ProductCategoryEnum category;

    @Column(name = "image_url", nullable = false, length = 256)
    private String imageUrl;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "description", length = 1024)
    private String description;

    @Column(name = "created_date", nullable = false)
    private OffsetDateTime createdDate;

    @Column(name = "last_modified_date", nullable = false)
    private OffsetDateTime lastModifiedDate;
}
