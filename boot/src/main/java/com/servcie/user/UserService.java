/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package com.servcie.user;

import com.model.User;

/**
 * Created by IntelliJ IDEA
 * 〈类详细描述〉 <p>
 * 〈功能详细描述〉
 *
 * @author liao
 * @date
 * @time
 */

public interface UserService {
	public User login(String userName,String password);
}
