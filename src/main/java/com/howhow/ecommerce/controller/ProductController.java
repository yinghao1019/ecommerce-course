package com.howhow.ecommerce.controller;

import com.howhow.ecommerce.model.dto.ProductDTO;
import com.howhow.ecommerce.service.ProductService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products/{productId}")
    public ProductDTO getProductById(@PathVariable Integer productId) throws Exception {
        return productService.getProductById(productId);
    }
}
