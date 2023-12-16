package com.workintech.model.controller;

import com.workintech.model.entity.Course;
import com.workintech.model.entity.CourseGpa;
import com.workintech.model.entity.LowCourseGpa;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/courses")
public class CourseController {
    List<Course> courses ;

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
}
