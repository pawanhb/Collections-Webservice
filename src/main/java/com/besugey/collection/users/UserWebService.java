package com.besugey.collection.users;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.besugey.collection.role.RoleEntity;

@Service
@Transactional
public class UserWebService {

	@Autowired
	UserRepository userRepo;
	
	public List<UserEntity> listAllUsers(){
		return userRepo.findAll();
	}
	
	public List<UserEntity> listAgents(){
		List<UserEntity> users = userRepo.findAll();
		return users.stream().filter(u ->u.getRole().getRoleType().equalsIgnoreCase("AGENT")).collect(Collectors.toList());
	}
}
