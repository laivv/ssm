package com.lingluo.dao;

import com.lingluo.model.User;

public interface UserDao extends BaseDao<User> {
	public User findUser(User user);
}
