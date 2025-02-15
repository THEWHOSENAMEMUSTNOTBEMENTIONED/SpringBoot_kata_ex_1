package com.nikita_semenov.spring.springboot.springboot_kata_ex_1.service;

import com.nikita_semenov.spring.springboot.springboot_kata_ex_1.model.User;
import com.nikita_semenov.spring.springboot.springboot_kata_ex_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    final
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {

        return userRepository.findAll();
    }

    public User findById(int id) {

        return userRepository.findById(id).orElse(null);
    }

    public void saveUser (User user) {

        userRepository.save(user);
    }


    public void deleteById (int id){

        userRepository.deleteById(id);
    }

}