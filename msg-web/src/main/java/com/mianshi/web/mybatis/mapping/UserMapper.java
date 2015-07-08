package com.mianshi.web.mybatis.mapping;

import org.springframework.stereotype.Repository;

import com.mianshi.web.entity.UserEntity;

public interface UserMapper {

	UserEntity getUserEntityById(int id);
}
