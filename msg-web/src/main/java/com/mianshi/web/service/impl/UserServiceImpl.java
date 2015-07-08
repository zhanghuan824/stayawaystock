package com.mianshi.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mianshi.web.entity.UserEntity;
import com.mianshi.web.mybatis.mapping.UserMapper;
import com.mianshi.web.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public UserEntity getUserEntityById(int id) {		
		return userMapper.getUserEntityById(id);
	}

}
