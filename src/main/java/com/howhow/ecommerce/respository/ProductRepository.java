package com.howhow.ecommerce.respository;

import com.howhow.ecommerce.model.entity.ProductEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    ProductEntity findByProductId(Integer id);
}
