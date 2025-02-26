package com.howhow.ecommerce.service;

import com.howhow.ecommerce.model.dto.ProductDTO;
import com.howhow.ecommerce.model.dto.ProductRequestDTO;

public interface ProductService {
    ProductDTO getProductById(Integer id) throws Exception;

    Integer createProduct(ProductRequestDTO productDTO) throws Exception;
}
