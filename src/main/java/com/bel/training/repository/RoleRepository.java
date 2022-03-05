package com.bel.training.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bel.training.model.Role;
import com.bel.training.model.Roles;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role> findByRoleName(Roles role);
}
