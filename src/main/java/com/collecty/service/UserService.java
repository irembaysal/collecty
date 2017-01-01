package com.collecty.service;

import java.util.List;

import com.collecty.dto.ServiceDto;
import com.collecty.dto.UserDto;
import com.collecty.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.collecty.entity.User;
import com.collecty.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public ServiceDto checkUserExist(String username)
	{
		ServiceDto serviceDto = new ServiceDto();
		List<User> users = userRepository.findByUsername(username);
		if(!CollectionUtils.isEmpty(users)){
			serviceDto.setMessage(ResponseUtil.SERVICE_MESSAGE_USER_EXIST_TRUE);
			serviceDto.setType(ResponseUtil.SERVICE_TYPE_SUCCESS);
		}else {
			serviceDto.setMessage(ResponseUtil.SERVICE_MESSAGE_USER_EXIST_FALSE);
			serviceDto.setType(ResponseUtil.SERVICE_TYPE_ERROR);
		}
		return  serviceDto;
	}
	
	
	public ServiceDto insertNewUser(UserDto userDto){
		ServiceDto serviceDto = new ServiceDto();
		userRepository.save(new User(userDto.getUsername(), userDto.getPassword(), userDto.getRole()));
		serviceDto.setMessage(ResponseUtil.SERVICE_MESSAGE_INSERT_USER_SUCCESS);
		serviceDto.setType(ResponseUtil.SERVICE_TYPE_SUCCESS);
		return serviceDto;
	}
}
