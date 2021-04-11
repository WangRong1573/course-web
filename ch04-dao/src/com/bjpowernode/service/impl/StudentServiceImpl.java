package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.util.SqlSessionUtil;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/11
 **/

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

    @Override
    public Student getById(Integer id) {
        Student student = studentDao.getById(id);
        return student;
    }

    @Override
    public int save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public List<Student> getAll() {
        List<Student> list = studentDao.getAll();
        return list;
    }
}
