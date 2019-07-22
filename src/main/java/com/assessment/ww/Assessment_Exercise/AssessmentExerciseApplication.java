package com.assessment.ww.Assessment_Exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssessmentExerciseApplication {

    public static final Logger logger = LogManager.getLogger(AssessmentExerciseApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(AssessmentExerciseApplication.class, args);
        logger.info("Starting SB app");
    }
}
