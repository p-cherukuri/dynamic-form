package com.formdb.service;

import com.formdb.model.User;

/**
 * Created by Phani on 2/22/17.
 */

public interface UserService {
        public User findUserByEmail(String email);
        public void saveUser(User user);
}