package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<UserModel> getAllUsers() {
        return userService.getUsers();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/user")
    public void addUser(@RequestBody UserModel userModel) {
        userService.addUser(userModel);
    }

    @RequestMapping("/users/{id}")
    public UserModel getTopic(@PathVariable int id) {
        return userService.getUser(id);

    }
}
