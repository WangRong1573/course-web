package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentDao {

    Student getById(Integer id);

    int save(Student student);

    List<Student> getAll();
}
