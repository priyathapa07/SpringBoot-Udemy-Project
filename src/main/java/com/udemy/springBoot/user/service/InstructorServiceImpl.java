package com.udemy.springBoot.user.service;

import com.udemy.springBoot.user.entity.Instructor;
import com.udemy.springBoot.user.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorServiceImpl implements InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

//    @Override
//    public List<Instructor> aLlInstructor() {
//        return instructorRepository.findAll();
//    }

    @Override
    public Instructor save(Instructor instructor) {
        return instructorRepository.save(instructor);
    }
}
