package com.assessment.ww.Assessment_Exercise.service;

import com.assessment.ww.Assessment_Exercise.dao.AuthorRepository;
import com.assessment.ww.Assessment_Exercise.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Wojciech Wasilewski
 * @date Created on 21.07.2019
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author findAuthorById(long authorId) {

        Optional<Author> result = authorRepository.findById(authorId);

        Author theAuthor = null;
        if (result.isPresent()) {
            theAuthor = result.get();
        } else {
            throw new RuntimeException("Can't find author with id: " + authorId);
        }
        return theAuthor;
    }

    @Override
    public void addAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void deleteAuthorById(long authorId) {
        authorRepository.deleteById(authorId);
    }

    @Override
    public void deleteAllAuthors() {
        authorRepository.deleteAll();
    }
}
