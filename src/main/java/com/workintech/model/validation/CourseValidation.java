package com.workintech.model.validation;

import com.workintech.model.exceptions.CourseException;
import org.springframework.http.HttpStatus;
import com.workintech.model.entity.Course;

public class CourseValidation {
    public static void checkCredit(Integer credit) {
        if (credit == null || credit < 0 || credit > 4) {
            throw new CourseException("credit must be between 0-4", HttpStatus.BAD_REQUEST);

        }
    }

}
