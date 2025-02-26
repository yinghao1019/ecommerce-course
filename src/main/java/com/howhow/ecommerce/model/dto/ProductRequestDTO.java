package com.howhow.ecommerce.model.dto;

import com.howhow.ecommerce.constant.ProductCategoryEnum;

import jakarta.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ProductRequestDTO {
    @NotNull private String productName;
    @NotNull private ProductCategoryEnum category;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;
}
