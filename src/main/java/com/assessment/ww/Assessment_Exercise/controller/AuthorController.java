package com.assessment.ww.Assessment_Exercise.controller;

import com.assessment.ww.Assessment_Exercise.model.Author;
import com.assessment.ww.Assessment_Exercise.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Wojciech Wasilewski
 * @date Created on 23.07.2019
 */
@RestController
public class AuthorController {

    AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/api/authors")
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }
}
