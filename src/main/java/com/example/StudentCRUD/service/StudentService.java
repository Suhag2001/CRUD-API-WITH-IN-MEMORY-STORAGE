package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;

public interface StudentService {
    Student insertStudent(Student student);

    Student getStudent(int rollNumber);
}
