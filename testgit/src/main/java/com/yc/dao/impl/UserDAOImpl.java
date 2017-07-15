package com.yc.dao.impl;

import com.yc.bean.User;
import com.yc.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

	@Override
	public void login(User user) {
		System.out.println(" 登录成功！！！！！");
	}

}
