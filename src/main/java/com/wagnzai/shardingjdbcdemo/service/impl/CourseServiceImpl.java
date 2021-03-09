package com.wagnzai.shardingjdbcdemo.service.impl;

import com.wagnzai.shardingjdbcdemo.entity.Course;
import com.wagnzai.shardingjdbcdemo.mapper.CourseDao;
import com.wagnzai.shardingjdbcdemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;


    @Override
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

}
