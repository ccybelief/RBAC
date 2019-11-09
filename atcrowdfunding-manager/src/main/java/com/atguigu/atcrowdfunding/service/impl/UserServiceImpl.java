package com.atguigu.atcrowdfunding.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.dao.UserDao;
import com.atguigu.atcrowdfunding.service.UserService;
@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserDao userDao;

public List<User> queryAll() {
	// TODO Auto-generated method stub
	return userDao.queryAll();
}

public User query4Login(User user) {
	// TODO Auto-generated method stub
	return userDao.query4Login(user);
}

public List<User> pageQueryData(Map<String, Object> map) {
	// TODO Auto-generated method stub
	return userDao.pageQueryData( map);
}

public int pageQueryCount(Map<String, Object> map) {
	// TODO Auto-generated method stub
	return userDao.pageQueryCount(map);
}
}
