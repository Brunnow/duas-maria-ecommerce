package com.ecommerce.duas_marias.repositories;

import com.ecommerce.duas_marias.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
