package com.chini.controller;

import com.chini.pojo.Books;
import com.chini.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
 
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
 
    @RequestMapping("/allBook")
    public String list(Model model) {

        System.out.println(bookService);
        List<Books> list = bookService.queryAllBook();
//        Books list = bookService.queryBookById(1);

        System.out.println(list);

        model.addAttribute("list", list);
        return "allbook";
    }
}
