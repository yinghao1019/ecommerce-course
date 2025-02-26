package com.howhow.ecommerce.controller;

import com.howhow.ecommerce.model.dto.ProductDTO;
import com.howhow.ecommerce.model.dto.ProductRequestDTO;
import com.howhow.ecommerce.service.ProductService;

import lombok.RequiredArgsConstructor;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products/{productId}")
    public ProductDTO getProductById(@PathVariable Integer productId) throws Exception {
        return productService.getProductById(productId);
    }

    @PostMapping("/products")
    public Integer createProduct(@RequestBody @Validated ProductRequestDTO productRequestDTO)
            throws Exception {
        return productService.createProduct(productRequestDTO);
    }
}
