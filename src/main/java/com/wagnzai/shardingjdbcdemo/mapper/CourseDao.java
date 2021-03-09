package com.wagnzai.shardingjdbcdemo.mapper;

import com.wagnzai.shardingjdbcdemo.entity.Course;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao {

    public boolean addCourse(@Param("course") Course course);

    public Course selectById(@Param("cid") Long cid);

}
