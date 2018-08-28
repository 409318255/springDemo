/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * 〈首页action〉 <p>
 * 〈功能详细描述〉
 *
 * @author liao
 * @date
 * @time
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {
	@RequestMapping(value = "/index")
	public ModelAndView index(HttpSession session){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName ("index");
		List<String> userList =new ArrayList<> ();
		userList.add ("admin");
		userList.add ("user1");
		userList.add ("user2");
		session.setAttribute ("userName","user3");
		modelAndView.addObject ("userList",userList);
		return modelAndView;
	}
}
