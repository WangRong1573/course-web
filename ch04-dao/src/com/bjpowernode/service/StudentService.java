package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentService {
    Student getById(Integer id);

    int save(Student student);

    List<Student> getAll();
}
