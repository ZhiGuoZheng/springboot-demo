package com.example.demo.controller;

import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 书籍 Controller
 *
 * @author zhiguo.zheng
 * @time 2019/4/28 23:20
 */
@RestController
public class BookController {

    @Autowired
    private Book book;

    @GetMapping(path = {"/book", "books"})
    public String book() {
        return book.toString();
    }
}
