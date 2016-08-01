package com.endava.webfundamentals.signin.service.impl;

import com.endava.webfundamentals.signin.dto.UserCredentialDTO;
import com.endava.webfundamentals.signin.model.User;
import com.endava.webfundamentals.signin.service.AuthenticationService;
import com.endava.webfundamentals.signin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by fstancu on 7/22/2016.
 */

public abstract class AbstractAuthenticationService implements AuthenticationService {

    protected static final String SESSION = "session";

    @Autowired
    protected UserService userService;

    @Override
    public boolean isValid(UserCredentialDTO userCredentialDTO) {
        User user = userService.getUserByUsername(userCredentialDTO.getUsername().toLowerCase());
        return userCredentialDTO != null &&
                user != null &&
                user.getPassword().equals(userCredentialDTO.getPassword());
    }

}
