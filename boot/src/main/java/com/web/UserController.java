/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package com.web;

import com.dao.UserMapper;
import com.model.User;
import com.servcie.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;

/**
 * Created by IntelliJ IDEA
 * 〈类详细描述〉 <p>
 * 〈功能详细描述〉
 *
 * @author liao
 * @date
 * @time
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/web/welcome")
	@ResponseBody
	public String welcome(){
		return "欢迎使用系统";
	}
	
	@RequestMapping("loginView")
	public String loginView(){
		return "user/login";
	}
	
	@RequestMapping("login")
	public String login(String username, String password, HttpServletRequest request){
		System.out.print (username+":"+password);
		User user=userService.login (username,password);
		System.out.print (user.getUserName ());
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject ("phone",user.getPhone ());
		request.setAttribute ("phone",user.getPhone ());
		return "user/main";
	}
}
