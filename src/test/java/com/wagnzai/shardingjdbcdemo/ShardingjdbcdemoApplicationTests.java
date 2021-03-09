package com.wagnzai.shardingjdbcdemo;

import com.wagnzai.shardingjdbcdemo.entity.Course;
import com.wagnzai.shardingjdbcdemo.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingjdbcdemoApplicationTests {


    @Autowired
    private CourseService courseService;

    @Test
    void addCourse() {
        Course course = new Course();
        course.setCid(446L);
        course.setCname("java");
        course.setUserId(100L);
        course.setCstatus("Normal");
        courseService.addCourse(course);

    }

}
