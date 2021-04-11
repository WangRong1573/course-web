package com.bjpowernode.dao.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/11
 **/

public class StudentDaoImpl implements StudentDao {
    @Override
    public Student getById(Integer id) {
        SqlSession session = SqlSessionUtil.getSession();
        Student student = session.selectOne("test1.getById", id);
        return student;
    }

    @Override
    public int save(Student student) {
        SqlSession session = SqlSessionUtil.getSession();
        int num = session.insert("test1.save", student);
        return num;
    }
}
