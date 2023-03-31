package com.poly.dax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.dax.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
