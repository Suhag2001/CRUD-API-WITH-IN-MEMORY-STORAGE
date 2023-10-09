package com.example.StudentCRUD.repo;

import com.example.StudentCRUD.model.Student;

public interface StudentRepo {
    Student insertStudent(Student student);

    Student getStudent(int rollNumber);
}
