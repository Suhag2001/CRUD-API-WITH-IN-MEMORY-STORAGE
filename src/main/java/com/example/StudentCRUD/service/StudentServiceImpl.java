package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student insertStudent(Student student) {
        return studentRepo.insertStudent(student);
    }

    @Override
    public Student getStudent(int rollNumber) {
       return studentRepo.getStudent(rollNumber);
    }
}
