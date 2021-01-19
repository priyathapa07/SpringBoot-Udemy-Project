package com.udemy.springBoot.user.service;

import com.udemy.springBoot.user.entity.Course;
import com.udemy.springBoot.user.entity.Student;
import com.udemy.springBoot.user.repository.CourseRepository;
import com.udemy.springBoot.user.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Course> findCourses() {
        return courseRepository.findAll();
    }
}
