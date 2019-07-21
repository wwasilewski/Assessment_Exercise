package com.assessment.ww.Assessment_Exercise.bootstrap;

import com.assessment.ww.Assessment_Exercise.dao.AuthorRepository;
import com.assessment.ww.Assessment_Exercise.dao.BookRepository;
import com.assessment.ww.Assessment_Exercise.model.Author;
import com.assessment.ww.Assessment_Exercise.model.Book;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Wojciech Wasilewski
 * @date Created on 21.07.2019
 */

// this is a starting class to check if data is inserting correctly into database
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public DevBootstrap(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        insertData();
    }

    private void insertData() {

        // 1st book
        Author firstAuthor = new Author("David", "McRaney");
        Book firstBook = new Book("First Book", "3421");
        firstAuthor.getBooks().add(firstBook);
        firstBook.getAuthors().add(firstAuthor);

        authorRepository.save(firstAuthor);
        bookRepository.save(firstBook);

        // 2nd book
        Author secondAuthor = new Author("Stephen", "King");
        Book secondBook = new Book("IT", "1422");
        secondAuthor.getBooks().add(secondBook);
        secondBook.getAuthors().add(secondAuthor);

        authorRepository.save(secondAuthor);
        bookRepository.save(secondBook);
    }
}
