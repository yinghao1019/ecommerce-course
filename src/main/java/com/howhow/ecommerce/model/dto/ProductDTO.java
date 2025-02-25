package com.howhow.ecommerce.model.dto;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class ProductDTO {

    private Integer productId;
    private String productName;
    private String categoryUrl;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;
    private OffsetDateTime createdDate;
}
