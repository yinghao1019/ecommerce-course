package com.howhow.ecommerce.service.impl;

import com.howhow.ecommerce.dao.ProductRepository;
import com.howhow.ecommerce.model.dto.ProductDTO;
import com.howhow.ecommerce.model.dto.ProductRequestDTO;
import com.howhow.ecommerce.model.entity.ProductEntity;
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
        productDTO.setCategory(productEntity.getCategory());
        productDTO.setImageUrl(productEntity.getImageUrl());
        productDTO.setPrice(productEntity.getPrice());
        productDTO.setStock(productEntity.getStock());
        productDTO.setDescription(productEntity.getDescription());
        productDTO.setCreatedDate(productEntity.getCreatedDate());

        return productDTO;
    }

    @Override
    public Integer createProduct(ProductRequestDTO productDTO) throws Exception {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductName(productDTO.getProductName());
        productEntity.setCategory(productDTO.getCategory());
        productEntity.setImageUrl(productDTO.getImageUrl());
        productEntity.setPrice(productDTO.getPrice());
        productEntity.setStock(productDTO.getStock());
        productEntity.setDescription(productDTO.getDescription());
        return productRepository.save(productEntity).getProductId();
    }
}
