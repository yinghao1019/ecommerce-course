package com.howhow.ecommerce.service;

import com.howhow.ecommerce.model.dto.ProductDTO;

public interface ProductService {
    ProductDTO getProductById(Integer id) throws Exception;
}
