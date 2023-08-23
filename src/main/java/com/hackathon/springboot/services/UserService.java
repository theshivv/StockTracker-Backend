package com.hackathon.springboot.services;

import com.hackathon.springboot.entities.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();


    public User getUserById(int id);


    public User addUser(User user);

    public User updateUser(User user);

    public void deleteUser(int id);
}
