package com.assessment.ww.Assessment_Exercise.dao;

import com.assessment.ww.Assessment_Exercise.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Wojciech Wasilewski
 * @date Created on 20.07.2019
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
