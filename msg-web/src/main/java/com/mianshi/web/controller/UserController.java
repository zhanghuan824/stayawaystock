package com.mianshi.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mianshi.web.entity.UserEntity;
import com.mianshi.web.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/{id}")
	public String getUser(@PathVariable int id, ModelMap modelMap, HttpServletRequest request) {
		UserEntity user = userService.getUserEntityById(id);
		if(user == null) {
			user = new UserEntity();
			user.setId(0);
			user.setName("test");
		}
		modelMap.put("user", user);
		return "showUser";
	}
}
