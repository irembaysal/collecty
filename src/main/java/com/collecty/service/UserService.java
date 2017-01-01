package com.collecty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collecty.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;



	
}
