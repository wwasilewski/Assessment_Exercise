package com.assessment.ww.Assessment_Exercise.service;

import com.assessment.ww.Assessment_Exercise.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wojciech Wasilewski
 * @date Created on 11.07.2019
 */
@Service
public interface BookService {

    // method to get all books
    public List<Book> getAllBooks();

    // method to get book by specific id
    public Book findBookById(long bookId);

    // method to add book
    public void addBook(Book book);

    // method to delete book by specific id
    public void deleteBookById(long bookId);
}
