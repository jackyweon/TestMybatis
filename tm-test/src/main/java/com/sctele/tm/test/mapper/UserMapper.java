package com.sctele.tm.test.mapper;

import com.sctele.tm.db.mapper.MyMapper;
import com.sctele.tm.test.domain.User;

/**
 * 
 * @title: UserMapper
 * @company: sctele
 * @author wenlei
 * @date 2019年4月25日
 */
public interface UserMapper extends MyMapper<User> {
	
	/**
	 * 
	 *		
	 * @title: getByName
	 * @data: 2019年4月25日
	 * @author wenlei
	 * @param name
	 * @return
	 */
	User getByName(String name);

}
