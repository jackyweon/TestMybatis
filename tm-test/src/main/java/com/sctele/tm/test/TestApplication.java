package com.sctele.tm.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * 
 *
 * @title: TestApplication
 * @company: sctele
 * @author wenlei
 * @date 2019年4月28日
 */
@SpringBootApplication
// 不要使用org.mybatis.spring.annotation.MapperScan，在调用BaseService的公共方法会报错
@MapperScan("com.sctele.tm.test.mapper")
@ComponentScan(basePackages = "com.sctele")
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
