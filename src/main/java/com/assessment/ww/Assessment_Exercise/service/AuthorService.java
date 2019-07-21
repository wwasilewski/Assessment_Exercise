package com.assessment.ww.Assessment_Exercise.service;

import com.assessment.ww.Assessment_Exercise.model.Author;

import java.util.List;

/**
 * @author Wojciech Wasilewski
 * @date Created on 21.07.2019
 */
public interface AuthorService {

    public List<Author> getAllAuthors();

    public Author findAuthorById(long authorId);

    public void addAuthor(Author author);

    public void deleteAuthorById(long authorId);

    public void deleteAllAuthors();
}
