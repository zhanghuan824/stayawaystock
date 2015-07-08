package com.mianshi.web.service;

import org.springframework.stereotype.Service;

import com.mianshi.web.entity.UserEntity;

public interface UserService {
	UserEntity getUserEntityById(int id);
}
