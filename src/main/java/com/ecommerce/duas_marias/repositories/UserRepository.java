package com.ecommerce.duas_marias.repositories;

import com.ecommerce.duas_marias.model.Product;
import com.ecommerce.duas_marias.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String username);
}
