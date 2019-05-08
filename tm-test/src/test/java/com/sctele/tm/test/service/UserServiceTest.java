package com.sctele.tm.test.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sctele.tm.test.TestApplication;
import com.sctele.tm.test.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class UserServiceTest {

	@Autowired
	UserService userService;

	@Test
	public void TestAddList() {
		User user1 = new User();
		user1.setName("user1");
		user1.setPassword("111");
		user1.setSex(1);

		User user2 = new User();
		user2.setName("user2");
		user2.setPassword("222");
		user2.setSex(2);

		List<User> userList = new ArrayList<>();
		userList.add(user1);
		userList.add(user2);

		userService.insertList(userList);
	}

}
