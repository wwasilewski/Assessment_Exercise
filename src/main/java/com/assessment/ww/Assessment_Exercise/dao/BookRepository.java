package com.assessment.ww.Assessment_Exercise.dao;

import com.assessment.ww.Assessment_Exercise.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Wojciech Wasilewski
 * @date Created on 11.07.2019
 */
// JpaRepository has useful methods so there is no need to create them
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
