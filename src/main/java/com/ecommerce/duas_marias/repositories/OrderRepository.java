package com.ecommerce.duas_marias.repositories;

import com.ecommerce.duas_marias.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
