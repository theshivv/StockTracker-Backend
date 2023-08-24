package com.hackathon.springboot.controllers;

import com.hackathon.springboot.entities.User;
import com.hackathon.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(path="/users/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable int id){
        return userService.getUserById(id);
    }

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(path = "/users", method = RequestMethod.POST)
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping(path = "/users",method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @RequestMapping(path= "/users/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }








}
