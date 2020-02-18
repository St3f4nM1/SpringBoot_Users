package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component

public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<UserModel> getUsers() {
        List<UserModel> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);
        return users;

    }

    public void addUser(UserModel userModel) {
        userRepository.save(userModel);
    }

    public UserModel getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public void updateUser(int id, UserModel userModel) {
        userRepository.save(userModel);
    }
}
