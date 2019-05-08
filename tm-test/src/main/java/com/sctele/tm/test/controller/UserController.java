package com.sctele.tm.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sctele.tm.common.domain.ResponseBo;
import com.sctele.tm.test.domain.User;
import com.sctele.tm.test.service.UserService;

/**
 * 
 * @title: UserController
 * @company: sctele
 * @author wenlei
 * @date 2019年4月24日
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;

	/**
	 * 
	 * 
	 * @title: selectAll
	 * @data: 2019年4月24日
	 * @author wenlei
	 * @return
	 */
	@GetMapping("/user/selectAll")
	public ResponseBo<List<User>> selectAll() {
		return ResponseBo.success(userService.selectAll());
	}

	/**
	 * 
	 * 
	 * @title: getByName
	 * @data: 2019年4月24日
	 * @author wenlei
	 * @param name
	 * @return
	 */
	@GetMapping("/user/getByName")
	public ResponseBo<User> getByName(@RequestParam String name) {
		return ResponseBo.success(userService.getByName(name));
	}
	
	/**
	 * 
	 *
	 * @title: add
	 * @author wenlei
	 * @data: 2019年4月28日
	 */
	@PostMapping("/user/add")
	public ResponseBo<String> add(@RequestBody User user){
		userService.addUser(user);
		return ResponseBo.success();
	}

}
