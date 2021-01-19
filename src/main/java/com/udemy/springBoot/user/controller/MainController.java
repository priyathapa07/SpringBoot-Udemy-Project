package com.udemy.springBoot.user.controller;

import com.udemy.springBoot.user.entity.Instructor;
import com.udemy.springBoot.user.entity.Student;
import com.udemy.springBoot.user.service.InstructorService;
import com.udemy.springBoot.user.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class MainController {

    private final InstructorService instructorService;
    private final StudentService studentService;
    public MainController(InstructorService instructorService, StudentService studentService) {
        this.instructorService = instructorService;
        this.studentService = studentService;
    }

    //for login Page
    @GetMapping("/")
    public String getLoginOptions() {
        return "loginOptions";
    }

    @GetMapping("/redirect")
      public String getLoginPage() {
        return "redirect:/loginPage";
    }

    @GetMapping("/loginPage")
    public String getLoginPageStudent() {
        return "loginPage";
    }



//    //Instructor page
    @GetMapping("/instructor")
    public String getInstructorPage() {
        return "instructor_register";
    }
    @PostMapping("/instructor")
    public String getStudentRegistration(@ModelAttribute Instructor instructor) {
        instructorService.save(instructor);
        return "redirect:/instructor_dashboard";
    }

    @GetMapping("/instructor_dashboard")
    public String getInstructorDashboard(ModelMap map) {

        //populate dashboard
       // map.put("instName", "Axl");

        return "inst_dash";
    }

    //Student page
    @GetMapping("/student")
    public String getStudentPage() {
        return "student_register";
    }

    @PostMapping("/student")
    public String getStudentRegistration(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/student_dashboard";
    }
    @GetMapping("/student_dashboard")
    public String getStudentDashboard(ModelMap map) {
        //populate dashboard
        map.put("courses", studentService.findCourses());
        return "stud_dash";
    }


    @GetMapping("/studentDashboard")
    public String getStudentDashBoardInfo(ModelMap map){

        //logic to display info on this particular student's dashboard
        map.put("courses", studentService.findCourses());
        return "stud_dash";
    }

    @PostMapping("/studentDashboard")
    public String getStudentDashboard(@ModelAttribute Student student) {

        //logic to check credentials

        //pass
        return "redirect:/studentDashboard";
    }




}

