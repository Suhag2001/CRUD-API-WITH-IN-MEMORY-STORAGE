package com.example.StudentCRUD.controller;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student insertStudent( @RequestBody  Student student){
        return studentService.insertStudent(student);
    }

    @GetMapping("/student/{rollNumber}")
    public Student getStudent(@PathVariable int rollNumber){
      return   studentService.getStudent(rollNumber);
    }
}
