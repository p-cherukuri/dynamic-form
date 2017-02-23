package com.formdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formdb.model.User;

/**
 * Created by Phani on 2/22/17.
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
        User findByEmail(String email);
}
