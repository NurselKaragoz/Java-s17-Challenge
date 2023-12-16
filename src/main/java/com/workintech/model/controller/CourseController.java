package com.workintech.model.controller;

import com.workintech.model.entity.Course;
import com.workintech.model.entity.CourseGpa;
import com.workintech.model.entity.HighCourseGpa;
import com.workintech.model.exceptions.CourseException;
import com.workintech.model.validation.CourseValidation;
import jakarta.annotation.PostConstruct;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/courses")
public class CourseController {
    List<Course> courses ;
    private HighCourseGpa highCourseGpa;

    @PostConstruct
    public void initCourse(){
        this.courses=new ArrayList<>();

    }

   private CourseGpa lowCourseGpa;
    private CourseGpa mediumCourseGpa;
    private CourseGpa HighCourseGPa;

    public CourseController(@Qualifier("lowCourseGpa") CourseGpa lowCourseGpa,
                            @Qualifier("mediumCourseGpa") CourseGpa mediumCourseGpa,
                            @Qualifier("highCourseGpa") CourseGpa highCourseGPa) {
        this.lowCourseGpa = lowCourseGpa;
        this.mediumCourseGpa = mediumCourseGpa;
        HighCourseGPa = highCourseGPa;
    }
    @GetMapping("/")
    public List<Course> findAll(){
        return this.courses;
    }
    @GetMapping("/{name}")
    public Course getByName(@PathParam("name") String name){
        Course course= new Course();
        return course;
    }



    }


