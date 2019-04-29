package com.example.demo.controller;

import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 书籍 Controller
 *
 * @author zhiguo.zheng
 * @time 2019/4/28 23:20
 */
@RestController
public class BookController {

//    @Autowired
//    private Book book;

    @GetMapping(path = {"book", "books"})
    public ModelAndView book() {
        List<Book> books = new ArrayList<>();

        Book b1 = new Book();
        b1.setId(1);
        b1.setName("三国演义");
        b1.setAuthor("罗贯中");
        b1.setPrice(30f);

        Book b2 = new Book();
        b2.setId(2);
        b2.setName("水浒传");
        b2.setAuthor("施耐庵");
        b2.setPrice(108f);

        Book b3 = new Book();
        b3.setId(3);
        b3.setName("西游记");
        b3.setAuthor("吴承恩");
        b3.setPrice(40f);

        Book b4 = new Book();
        b4.setId(4);
        b4.setName("红楼梦");
        b4.setAuthor("曹雪芹");
        b4.setPrice(100f);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("books");
        return mv;
    }
}
