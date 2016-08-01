package com.endava.webfundamentals.signin.service.impl;

import com.endava.webfundamentals.signin.dto.UserRegisterDTO;
import com.endava.webfundamentals.signin.model.User;
import com.endava.webfundamentals.signin.repository.UserRepository;
import com.endava.webfundamentals.signin.service.UserService;
import org.apache.commons.collections.IteratorUtils;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by aancuta on 8/1/2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Mapper mapper;

    @Override
    @Transactional(readOnly = true)
    public User getUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        return user;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return IteratorUtils.toList(userRepository.findAll().iterator());
    }

    @Override
    public void saveUser(UserRegisterDTO userRegisterDTO) {
        User user = new User();
        user.setUsername(userRegisterDTO.getUsername());
        user.setPassword(userRegisterDTO.getPassword());
        userRepository.save(user);
    }
}
