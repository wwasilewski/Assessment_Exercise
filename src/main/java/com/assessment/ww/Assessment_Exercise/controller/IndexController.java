package com.assessment.ww.Assessment_Exercise.controller;

import com.assessment.ww.Assessment_Exercise.model.Book;
import com.assessment.ww.Assessment_Exercise.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author Wojciech Wasilewski
 * @date Created on 12.07.2019
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private BookService bookService;

    @Autowired
    public IndexController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping({"/", "", "/index"})
    public String showAll(Model model) {
        model.addAttribute("books", bookService.getAllBooks());

        return "index";
    }

    @GetMapping("/add")
    public String addBook() {
        return "addBook";
    }

    // not working yet
    @PostMapping("/add")
    public String addBook(@Valid Book book, Model model) {
        bookService.addBook(book);
        model.addAttribute("books", bookService.getAllBooks());

        return "addBook";
    }
}

