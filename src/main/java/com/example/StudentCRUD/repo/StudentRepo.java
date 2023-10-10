package com.example.StudentCRUD.repo;

import com.example.StudentCRUD.model.Student;

import java.util.List;

public interface StudentRepo {
    Student insertStudent(Student student);

    Student getStudent(int rollNumber);

    List<Student> getStudentList();

    Student updateStudent(int studentId,Student student);

    String deleteStudent(int studentId);

    List<Student> getStudentsByBranch(String branch);
}
