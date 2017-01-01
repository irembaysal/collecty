package com.collecty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody String login(@RequestParam(value="username") String username, @RequestParam(value="password") String password)
	{
		return "username:"+username+", password:"+password;
	}

}
