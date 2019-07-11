package com.assessment.ww.Assessment_Exercise.service;

import com.assessment.ww.Assessment_Exercise.dao.BookRepository;
import com.assessment.ww.Assessment_Exercise.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Wojciech Wasilewski
 * @date Created on 11.07.2019
 */
@Service
public class BookServiceImpl implements BookService {

    // bookrepository that extends JpaRepository with useful methods
    private BookRepository bookRepository;

    // injecting by constructor
    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book findBookById(long bookId) {

        Optional<Book> result = bookRepository.findById(bookId);

        Book theBook = null;
        if (result.isPresent()) {
            theBook = result.get();
        } else {
            throw new RuntimeException("Didn't find book with id: " + bookId);
        }
        return theBook;
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBookById(long bookId) {
        bookRepository.deleteById(bookId);
    }
}
