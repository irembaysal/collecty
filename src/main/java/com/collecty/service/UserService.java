package com.collecty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.collecty.entity.User;
import com.collecty.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public boolean checkUserExist(String username)
	{
		List<User> users = userRepository.findByUsername(username);
		return !CollectionUtils.isEmpty(users);
	}
	
	
	public User insertNewUser(String username, String password)
	{
		return userRepository.save(new User(username,password));

	}


	
}
