package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

public interface StudentDao {

    Student getById(Integer id);

    int save(Student student);
}
