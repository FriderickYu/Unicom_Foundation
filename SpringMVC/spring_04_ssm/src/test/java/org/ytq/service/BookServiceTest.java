package org.ytq.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ytq.config.SpringConfig;
import org.ytq.domain.Book;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    public void testGetById(){
        Book book = bookService.getById(11);
        System.out.println(book);
    }
    @Test
    public void testGetAll(){
        List<Book> list = bookService.getAll();
        System.out.println(list);
    }
}
