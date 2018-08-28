/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package com.servcie.user.impl;

import com.dao.UserMapper;
import com.model.User;
import com.servcie.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA
 * 〈类详细描述〉 <p>
 * 〈功能详细描述〉
 *
 * @author liao
 * @date
 * @time
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User login (String userName, String password) {
		return userMapper.findByUserNameAndPassword (userName,password);
	}
}
