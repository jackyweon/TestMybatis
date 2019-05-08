package com.sctele.tm.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sctele.tm.db.service.impl.BaseServiceImpl;
import com.sctele.tm.test.domain.User;
import com.sctele.tm.test.mapper.UserMapper;
import com.sctele.tm.test.service.UserService;

/**
 * 
 * @title: UserServiceImpl
 * @company: sctele
 * @author wenlei
 * @date 2019年4月24日
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> listAll() {
		return userMapper.selectAll();
	}

	@Override
	public User getByName(String name) {
		return userMapper.getByName(name);
	}

	@Override
	public void addUser(User user) {
		this.save(user);
	}

}
