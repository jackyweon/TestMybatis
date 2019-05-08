package com.sctele.tm.test.service.impl;

import org.springframework.stereotype.Service;

import com.sctele.tm.db.service.impl.BaseServiceImpl;
import com.sctele.tm.test.domain.Book;
import com.sctele.tm.test.service.BookService;

@Service
public class BookServiceImpl extends BaseServiceImpl<Book> implements BookService {

}
