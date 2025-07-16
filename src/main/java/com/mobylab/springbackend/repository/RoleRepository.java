package com.mobylab.springbackend.repository;

import com.mobylab.springbackend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository  extends JpaRepository<Role, Integer> {

    Optional<Role> findRoleByName(String name);
}
