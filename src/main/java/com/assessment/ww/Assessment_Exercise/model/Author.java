package com.assessment.ww.Assessment_Exercise.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Wojciech Wasilewski
 * @date Created on 19.07.2019
 */
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String forename;
    private String surname;

    @ManyToMany
    private Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(String forename, String surname) {
        this.forename = forename;
        this.surname = surname;
    }

    public Author(String forename, String surname, Set<Book> books) {
        this.forename = forename;
        this.surname = surname;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
