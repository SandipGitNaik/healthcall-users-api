package com.healthcalluser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcalluser.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
