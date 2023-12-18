package com.example.hostelspring.service.impl;


import com.example.hostelspring.model.User;
import com.example.hostelspring.repository.UserRepository;
import com.example.hostelspring.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;


    @Override
    public int calculateOrderNumber(int userId) {
        return 0;
    }

    @Override
    public User getUserByUsername(String login) {
        return userRepository.getUserByLogin(login);
    }

    @Override
    public User addUser(String login, String password) {
        User user = new User();
        user.setPassword(password);
        user.setLogin(login);
        return userRepository.save(user);
    }

    @Override
    public User findUserById(int userId) {
        return null;
    }

    @Override
    public void updateUser( int id,User user) {
        User old = new User();
        old=userRepository.findById(Long.valueOf(id)).get();
        old.setLogin(user.getLogin());
        old.setPassword(user.getPassword());
        userRepository.save(old);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }



}


