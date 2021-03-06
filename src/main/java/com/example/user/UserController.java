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
    public UserModel getUserById(@PathVariable int id) {
        return userService.getUser(id);
    }

    @RequestMapping("/users/{id}")
    public void updateUserById(@RequestBody UserModel userModel, @PathVariable int id) {
        userService.updateUser(id, userModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/user/{id}")
    public void deleteUserById(@PathVariable int id) {
        userService.deleteUser(id);
    }
}
