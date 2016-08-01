package com.endava.webfundamentals.signin.service;

import com.endava.webfundamentals.signin.dto.UserRegisterDTO;
import com.endava.webfundamentals.signin.model.User;

import java.util.List;

/**
 * Created by aancuta on 8/1/2016.
 */
public interface UserService {
    User getUserByUsername(String username);

    List<User> getAllUsers();

    void saveUser(UserRegisterDTO userRegisterDTO);
}
