package com.yc.biz.impl;

import com.yc.bean.User;
import com.yc.biz.UserBiz;
import com.yc.dao.UserDAO;
import com.yc.dao.impl.UserDAOImpl;

public class UserBizImpl implements UserBiz {

	public void login(User user) {
		UserDAO userDAO = new UserDAOImpl();
		userDAO.login(user);
	}

}
