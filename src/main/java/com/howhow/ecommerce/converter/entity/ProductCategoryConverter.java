package com.howhow.ecommerce.converter.entity;

import com.howhow.ecommerce.constant.ProductCategoryEnum;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ProductCategoryConverter implements AttributeConverter<ProductCategoryEnum, String> {

    @Override
    public String convertToDatabaseColumn(ProductCategoryEnum attribute) {
        return attribute == null ? null : attribute.name();
    }

    @Override
    public ProductCategoryEnum convertToEntityAttribute(String dbData) {
        return ProductCategoryEnum.valueOf(dbData);
    }
}
