package com.yc.test;

import org.junit.Test;

import com.yc.bean.User;
import com.yc.biz.UserBiz;
import com.yc.biz.impl.UserBizImpl;

public class Test1 {
	
	@Test
	public void testLogin(){
		User user = new User();
		user.setId(1);
		user.setName("kd");
		UserBiz userBiz = new UserBizImpl();
		userBiz.login(user);
	}
}
