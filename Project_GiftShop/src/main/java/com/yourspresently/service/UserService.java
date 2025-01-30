package com.yourspresently.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yourspresently.pojos.Users;
import com.yourspresently.repository.UserRepository;

import java.util.Optional;
import java.util.List;
//import com.project_giftshop.model.User;
//import com.project_giftshop.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<Users> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public boolean userExists(String email) {
        return userRepository.existsByEmail(email);
    }
}
