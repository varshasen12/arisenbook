package com.arisenbook.arisenbookapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.arisenbook.arisenbookapp.model.UserModel;
import com.arisenbook.arisenbookapp.repository.UserRepository;

import java.util.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/get")
	public List<UserModel> getUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/add")
	public  void createUser(@RequestBody UserModel user) {
		userRepository.save(user);
	}
	
	@DeleteMapping(path = { "/{id}" })
	public UserModel deleteUser(@PathVariable("id") long id) {
		UserModel user = userRepository.getOne(id);
		userRepository.deleteById(id);
		return user;
	}
	
	@PutMapping("/update")
	public void updateUser(@RequestBody UserModel user) {
		userRepository.save(user);
	}

}
