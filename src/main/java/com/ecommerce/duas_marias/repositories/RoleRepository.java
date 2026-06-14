package com.ecommerce.duas_marias.repositories;

import com.ecommerce.duas_marias.model.AppRole;
import com.ecommerce.duas_marias.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
   Optional<Role> findByRoleName(AppRole appRole);
}
