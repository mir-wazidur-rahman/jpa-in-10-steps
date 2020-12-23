package com.springboot.learing.jpa.jpain10steps.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.learing.jpa.jpain10steps.entity.User;

public interface UserRespository extends JpaRepository<User, Long>{

}
