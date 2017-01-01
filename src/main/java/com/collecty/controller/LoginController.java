package com.collecty.controller;

import com.collecty.dto.ServiceDto;
import com.collecty.dto.UserDto;
import com.collecty.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.collecty.entity.User;
import com.collecty.service.UserService;

@Controller
@RequestMapping("/registry")
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ResponseEntity<ServiceDto> register(@RequestBody UserDto userDto) throws Exception
	{
	    try {
            ServiceDto insertUserSuccessDto = userService.insertNewUser(userDto);
            return new ResponseEntity<>(insertUserSuccessDto,HttpStatus.OK);
        }catch (Exception e){
            ServiceDto insertUserFailDto = new ServiceDto();
            insertUserFailDto.setMessage(ResponseUtil.SERVICE_MESSAGE_INSERT_USER_FAILED);
            insertUserFailDto.setType(ResponseUtil.SERVICE_TYPE_ERROR);
            return new ResponseEntity<>(insertUserFailDto,HttpStatus.BAD_REQUEST);
        }
	}
	
	@RequestMapping(value="/checkUserExist", method=RequestMethod.GET)
	public ResponseEntity<ServiceDto> checkUserExists(String username)
	{
		return new ResponseEntity<>(userService.checkUserExist(username), HttpStatus.OK);
	}
	

}
