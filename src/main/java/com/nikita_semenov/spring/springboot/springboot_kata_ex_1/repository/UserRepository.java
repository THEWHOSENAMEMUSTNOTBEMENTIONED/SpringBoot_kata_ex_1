package com.nikita_semenov.spring.springboot.springboot_kata_ex_1.repository;

import com.nikita_semenov.spring.springboot.springboot_kata_ex_1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


//для действий с БД
public interface UserRepository extends JpaRepository<User, Integer> {

}
