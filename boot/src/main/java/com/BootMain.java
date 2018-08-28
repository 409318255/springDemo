package com;/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */

import com.core.listener.MyApplicationStartedEventListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by IntelliJ IDEA
 * 〈类详细描述〉 <p>
 * 〈功能详细描述〉
 *
 * @author liao
 * @date
 * @time
 */
@SpringBootApplication(scanBasePackages="com.*")
@MapperScan("com.dao")
public class BootMain {
	public static void main (String[] args)throws Exception {
		SpringApplication springApplication =new SpringApplication(BootMain.class);
		springApplication.run ( args);
	}
}
