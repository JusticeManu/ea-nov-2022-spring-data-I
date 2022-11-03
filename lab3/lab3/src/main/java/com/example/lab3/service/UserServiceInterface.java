package com.example.lab3.service;

import com.example.lab3.entity.User;

import java.util.Optional;

public interface UserServiceInterface {

    public  void saveUser(User user);
    public Optional<User> getUser(Integer id);
    public User editUserById(Integer id,User user);
    public void deleteById(Integer id);
}
