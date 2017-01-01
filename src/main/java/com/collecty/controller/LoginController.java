package com.collecty.controller;

import com.collecty.dto.ServiceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.collecty.entity.User;
import com.collecty.service.UserService;

@Controller
@RequestMapping("/registry")
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public @ResponseBody User register(@RequestParam(value="username") String username, @RequestParam(value="password") String password)
	{
		return userService.insertNewUser(username, password);
	}
	
	@RequestMapping(value="/checkUserExist", method=RequestMethod.GET)
	public ResponseEntity<ServiceDto> checkUserExists(String username)
	{
		return new ResponseEntity<>(userService.checkUserExist(username), HttpStatus.OK);
	}
	

}
