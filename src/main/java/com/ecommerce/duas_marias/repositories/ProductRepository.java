package com.ecommerce.duas_marias.repositories;

import com.ecommerce.duas_marias.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
