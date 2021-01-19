package com.udemy.springBoot.user.service;

import com.udemy.springBoot.user.entity.Course;
import com.udemy.springBoot.user.entity.Student;

import java.util.List;

public interface StudentService{

    Student save(Student student);

    List<Course> findCourses();
}
