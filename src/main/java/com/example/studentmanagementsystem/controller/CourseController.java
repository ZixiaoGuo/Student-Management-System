package com.example.studentmanagementsystem.controller;


import com.example.studentmanagementsystem.model.Student;
import com.example.studentmanagementsystem.repository.CourseRepository;
import com.example.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/courses")
public class CourseController {
    private StudentRepository studentRepository;
    private CourseRepository courseRepository;

    @Autowired
    public CourseController(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

}
