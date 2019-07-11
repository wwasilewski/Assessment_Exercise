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

    public List<Book> findAllBooks();

    public Book findBookById(int bookId);

    public void saveBook(Book book);

    public void deleteBookById(int bookId);
}
