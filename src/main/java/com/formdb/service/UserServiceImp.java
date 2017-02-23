package com.formdb.service;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.formdb.model.Role;
import com.formdb.model.User;
import com.formdb.repository.RoleRepository;
import com.formdb.repository.UserRepository;

/**
 * Created by Phani on 2/22/17.
 */

@Service("userService")
public class UserServiceImp implements UserService {

        @Autowired
        private UserRepository userRepository;
        @Autowired
        private RoleRepository roleRepository;
        @Autowired
        private BCryptPasswordEncoder bCryptPasswordEncoder;

        @Override
        public void saveUser(User user) {
                user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
                user.setActive(1);
                Role userRole = roleRepository.findByRole("ADMIN");
                user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
                userRepository.save(user);
        }

}
