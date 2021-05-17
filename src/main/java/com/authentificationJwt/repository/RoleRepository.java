package com.authentificationJwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authentificationJwt.models.ERole;
import com.authentificationJwt.models.Role;

@Repository
	public interface RoleRepository extends JpaRepository<Role, Long> {
		Optional<Role> findByName(ERole name);
	}

