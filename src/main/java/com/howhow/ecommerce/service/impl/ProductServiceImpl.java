package com.howhow.ecommerce.service.impl;

import com.howhow.ecommerce.model.dto.ProductDTO;
import com.howhow.ecommerce.model.entity.ProductEntity;
import com.howhow.ecommerce.respository.ProductRepository;
import com.howhow.ecommerce.service.ProductService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public ProductDTO getProductById(Integer id) {
        ProductEntity productEntity = productRepository.findByProductId(id);
        if (productEntity == null) {
            throw new RuntimeException("Product not found");
        }

        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductId(productEntity.getProductId());
        productDTO.setProductName(productEntity.getProductName());
        productDTO.setCategoryUrl(productEntity.getCategory());
        productDTO.setImageUrl(productEntity.getImageUrl());
        productDTO.setPrice(productEntity.getPrice());
        productDTO.setStock(productEntity.getStock());
        productDTO.setDescription(productEntity.getDescription());
        productDTO.setCreatedDate(productEntity.getCreatedDate());

        return productDTO;
    }
}
