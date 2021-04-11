package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

public interface StudentService {
    Student getById(Integer id);

    int save(Student student);
}
