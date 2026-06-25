package com.ecommerce.duas_marias.repositories;

import com.ecommerce.duas_marias.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
