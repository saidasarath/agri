package com.klu.agri.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.agri.entity.User;

public interface UserRepository  extends JpaRepository<User,Integer>{
    public User findByName(String name);
}
