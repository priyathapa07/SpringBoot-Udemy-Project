package com.udemy.springBoot.user.repository;

import com.udemy.springBoot.user.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository  extends JpaRepository<Course,Integer> {
}
