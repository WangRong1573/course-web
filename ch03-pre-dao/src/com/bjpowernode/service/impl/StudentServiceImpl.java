package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.dao.impl.StudentDaoImpl;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/11
 **/

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    public Student getById(Integer id) {
        Student student = studentDao.getById(id);
        return student;
    }

    @Override
    public int save(Student student) {
        return studentDao.save(student);
    }
}
