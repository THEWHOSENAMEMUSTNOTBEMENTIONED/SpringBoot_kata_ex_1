package com.nikita_semenov.spring.springboot.springboot_kata_ex_1.service;

import com.nikita_semenov.spring.springboot.springboot_kata_ex_1.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
    void saveUser(User user);
    void deleteById(int id);
}
