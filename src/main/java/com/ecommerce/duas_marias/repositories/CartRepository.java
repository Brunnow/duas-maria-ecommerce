package com.ecommerce.duas_marias.repositories;

import com.ecommerce.duas_marias.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
