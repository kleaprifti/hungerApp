package com.hunger.app.service;

import com.hunger.app.repository.UserRepository;
import com.hunger.app.model.db.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(@Valid User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User modifyUser(User user) throws Exception {
        if (user.getUserId() == null) {
            throw new Exception("User ID cannot be null");
        }

        userRepository.findById(user.getUserId())
                .ifPresent(u -> userRepository.save(user));

        return user;
    }


}

