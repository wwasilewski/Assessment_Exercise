package com.assessment.ww.Assessment_Exercise.dao;

import com.assessment.ww.Assessment_Exercise.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Wojciech Wasilewski
 * @date Created on 11.07.2019
 */
// JpaRepository has useful methods so there is no need to create them
public interface BookRepository extends JpaRepository<Book, Long> {
}
