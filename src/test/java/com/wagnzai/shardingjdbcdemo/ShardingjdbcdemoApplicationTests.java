package com.wagnzai.shardingjdbcdemo;

import com.wagnzai.shardingjdbcdemo.entity.Course;
import com.wagnzai.shardingjdbcdemo.mapper.CourseDao;
import com.wagnzai.shardingjdbcdemo.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingjdbcdemoApplicationTests {


    @Autowired
    private CourseService courseService;

    @Autowired
    private CourseDao courseDao;

    @Test
    void addCourse() {
        Course course = new Course();
        course.setCid(2L);
        course.setCname("java");
        course.setUserId(1L);
        course.setCstatus("Normal");
        courseDao.addCourse(course);

    }

    @Test
    void selectById() {
        Course course = courseDao.selectById(446L);
        System.out.println(course.toString());
    }

}
