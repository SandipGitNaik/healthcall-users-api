package com.healthcalluser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcalluser.entity.User;
import com.healthcalluser.repository.UserRepository;

@Service
public class UserService {
	@Autowired
private UserRepository userRepository;

	public User save(User u) {
		// TODO Auto-generated method stub
		return userRepository.save(u);
	}

	public List<User> get() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public void deleteOne(User u) {
		// TODO Auto-generated method stub
		userRepository.delete(u);
	}
}
