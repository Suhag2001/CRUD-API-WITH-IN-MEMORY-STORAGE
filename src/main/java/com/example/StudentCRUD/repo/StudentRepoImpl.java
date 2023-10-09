package com.example.StudentCRUD.repo;

import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepoImpl implements StudentRepo{
    private Map<Integer,Student> studentMap = new HashMap<>();

    @Override
    public Student insertStudent(Student student) {
        studentMap.put(student.getRollNumber(),student);
        return student;
    }

    @Override
    public Student getStudent(int rollNumber) {
      return   studentMap.get(rollNumber);
    }
}
