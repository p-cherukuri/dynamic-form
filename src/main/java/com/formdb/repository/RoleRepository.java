package com.formdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formdb.model.Role;

/**
 * Created by Phani on 2/22/17.
 */

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {
        Role findByRole(String role);
}