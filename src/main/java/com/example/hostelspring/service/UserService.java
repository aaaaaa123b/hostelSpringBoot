package com.example.hostelspring.service;

import com.example.hostelspring.dto.UserDto;
import com.example.hostelspring.model.User;

import java.util.List;

public interface UserService {
    int calculateOrderNumber(int userId);

    User getUserByUsername(String login);

    User addUser(String login, String password);

    User findUserById(int userId);

    void updateUser(int userId, User user);

    List<User> findAll();
}
