package com.sctele.tm.test.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sctele.tm.test.TestApplication;
import com.sctele.tm.test.domain.Book;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class BookServiceTest {

	@Autowired
	BookService bookService;

	@Test
	public void testAddList() {
		Book book1 = new Book();
		book1.setBookName("java");
		book1.setBookPrice(new BigDecimal("65.23"));

		Book book2 = new Book();
		book2.setBookName("php");
		book2.setBookPrice(new BigDecimal("65.01"));

		List<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);

		bookService.insertList(bookList);
	}
	
	@Test
	public void testExample() {
		Example example = new Example(Book.class);
		Criteria criteria = example.createCriteria();
		// 要写属性名
		criteria.andEqualTo("bookName", "java");
		List<Book> books = bookService.selectByExample(example);
		System.out.println(books);
	}

}
