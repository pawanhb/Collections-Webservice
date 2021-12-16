package com.besugey.collection.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.besugey.collection.users.UserEntity;
import com.besugey.collection.users.UserWebService;

@RestController
public class UserController {

	@Autowired
	UserWebService userService;
	
	@GetMapping("/Users")
	public List<UserEntity> ListAllUsers(){
		return userService.listAllUsers();
	}
	
	@GetMapping("/listagents")
	public List<UserEntity> listAllAgents(){
		return userService.listAgents();
	}
}
