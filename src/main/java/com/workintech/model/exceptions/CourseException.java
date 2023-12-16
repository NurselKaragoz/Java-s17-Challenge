package com.workintech.model.exceptions;

import org.springframework.http.HttpStatus;

public class CourseException extends RuntimeException{
    public CourseException(String s, HttpStatus httpStatus) {
    }
}
