package com.assessment.ww.Assessment_Exercise.controller;

import com.assessment.ww.Assessment_Exercise.model.Book;
import com.assessment.ww.Assessment_Exercise.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Wojciech Wasilewski
 * @date Created on 11.07.2019
 */
@RestController
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // expose /books and get list of all books - GET
    @GetMapping("/api/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

//
//    // add mapping for getting specific book - GET
//    @GetMapping("/api/books/{bookId}")
//    public Book getBookById(@PathVariable long bookId) {
//
//        Book book = bookService.findBookById(bookId);
//
//        // throw exception if null
//        if (book == null) {
//            throw new RuntimeException("Didn't find book with id: " + bookId);
//        }
//        return book;
//    }
//
//    // add mapping for adding book - POST
//    @PostMapping("/api/books")
//    public Book addBook(@RequestBody Book book) {
//
//        // set id to 0 in case they pass id in JSON
//        // to force a save of new item instead od update
//        book.setId(0l);
//        bookService.addBook(book);
//        return book;
//    }
//
//    // add mapping for deleting book - DELETE
//    @DeleteMapping("/api/books/{bookId}")
//    public String deleteBookById(@PathVariable long bookId) {
//        Book tempBook = bookService.findBookById(bookId);
//
//        // throw exception if null
//        if (tempBook == null) {
//            throw new RuntimeException("There is no book with id: " + bookId);
//        }
//        bookService.deleteBookById(bookId);
//
//        return "Deleted book with id: " + bookId;
//    }
//
//    // add mapping for deleting all books - DELETE
//    @DeleteMapping("api/books")
//    public String deleteAllBooks() {
//        bookService.deleteAllBooks();
//        return "All records deleted";
//    }
//
//    @GetMapping("/book/add")
//    public ModelAndView addGet() {
//        ModelAndView m = new ModelAndView();
//        m.addObject("book", new Book());
//        m.setViewName("addBook");
//        return m;
//    }
//
//    @PostMapping("/book/add")
//    public ModelAndView addBook(Book book, BindingResult br) {
//        ModelAndView m = new ModelAndView("redirect:/index");
//        bookService.addBook(book);
//
//        m.addObject("book", new Book());
//        return m;
//    }
}
