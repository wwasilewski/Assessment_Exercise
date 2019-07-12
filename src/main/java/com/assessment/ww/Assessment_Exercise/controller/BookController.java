package com.assessment.ww.Assessment_Exercise.controller;

import com.assessment.ww.Assessment_Exercise.model.Book;
import com.assessment.ww.Assessment_Exercise.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Wojciech Wasilewski
 * @date Created on 11.07.2019
 */
@RestController
@RequestMapping("/api")
public class BookController {

    private BookService bookService;

    // injecting bookService via constructor
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // expose /books and get list of all books - GET
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // add mapping for getting specific book - GET
    @GetMapping("/books/{bookId}")
    public Book getBookById(@PathVariable long bookId) {

        Book book = bookService.findBookById(bookId);

        // throw exception if null
        if (book == null) {
            throw new RuntimeException("Didn't find book with id: " + bookId);
        }
        return book;
    }

    // add mapping for adding book - POST
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {

        // set id to 0 in case they pass id in JSON
        // to force a save of new item instead od update
        book.setId(0);
        bookService.addBook(book);
        return book;
    }

    // add mapping for deleting book - DELETE
    @DeleteMapping("/books/{bookId}")
    public String deleteBookById(@PathVariable long bookId) {
        Book tempBook = bookService.findBookById(bookId);

        // throw exception if null
        if (tempBook == null) {
            throw new RuntimeException("There is no book with id: " + bookId);
        }
        bookService.deleteBookById(bookId);

        return "Deleted book with id: " + bookId;
    }
}
