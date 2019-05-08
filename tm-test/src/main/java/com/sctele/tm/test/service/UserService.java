package com.sctele.tm.test.service;

import java.util.List;

import com.sctele.tm.db.service.BaseService;
import com.sctele.tm.test.domain.User;

/**
 * 
 *
 * @title: UserService
 * @company: sctele
 * @author wenlei
 * @date 2019年4月28日
 */
public interface UserService extends BaseService<User> {

	/**
	 * 
	 *
	 * @title: listAll
	 * @author wenlei
	 * @data: 2019年4月28日
	 */
	public List<User> listAll();

	/**
	 * 
	 *
	 * @title: getByName
	 * @author wenlei
	 * @data: 2019年4月28日
	 */
	public User getByName(String name);

	/**
	 * 
	 *
	 * @title: addUser
	 * @author wenlei
	 * @data: 2019年4月28日
	 */
	public void addUser(User user);
	
}
