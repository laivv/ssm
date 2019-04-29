package com.lingluo.service;

import com.lingluo.model.User;

public interface UserService extends BaseService<User> {
	public User findUser(User user);
}
