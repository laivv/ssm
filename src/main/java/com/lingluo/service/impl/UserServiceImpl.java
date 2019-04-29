package com.lingluo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lingluo.dao.UserDao;
import com.lingluo.model.User;
import com.lingluo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public User findUser(User user){
		return userDao.findUser(user);
	}
	@Override
	public void save(User t) {
		userDao.save(t);
		
	}
	@Override
	public void delete(String id) {
		userDao.delete(id);
	}
	@Override
	public void update(User t) {
		userDao.update(t);
		
	}
	@Override
	public User findById(String id) {
		return userDao.findById(id);
	}
	@Override
	public List<User> findByPage(int page, int size) {
		return userDao.findByPage(page, size);
	}
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}
}
