package com.healthcalluser.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcalluser.entity.User;
import com.healthcalluser.service.UserService;
@CrossOrigin("*")
@RestController
@RequestMapping("/user/")
public class UserController {

	@Autowired
	private UserService userService ;
	
	@PostMapping("save")
	public User oneSave(@RequestBody User u) {
		System.out.println(u.getUser_last_name());
		return userService.save(u);
	}
	@GetMapping("get")
	public List<User>getAll(){
		return userService.get();
	}
	@PostMapping("delete/{}")
	public void delete(@RequestBody User u) {
		userService.deleteOne(u);
	}
}
