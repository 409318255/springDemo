/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package com.core.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {
	
	private Logger logger = LoggerFactory.getLogger(MyApplicationFailedEventListener.class);
	
	@Override
	public void onApplicationEvent(ApplicationFailedEvent event) {
		Throwable throwable = event.getException();
		handleThrowable(throwable);
	}
	
	/*处理异常*/
	private void handleThrowable(Throwable throwable) {
		logger.info("发送异常了，可以给运维人员发个邮件什么的");
	}
}
