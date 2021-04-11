package com.bjpowernode.test;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.impl.StudentServiceImpl;
import com.bjpowernode.util.ServiceFactory;

import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/11
 **/

public class Test01 {
    public static void main(String[] args) {
        StudentService service = (StudentService) ServiceFactory.getProxy(new StudentServiceImpl());
        /*Student student = new Student();
        student.setId(null);
        student.setName("蔡徐坤");
        student.setAge(30);
        service.save(student);*/

        Student stu = service.getById(2);
        System.out.println(stu);
    }
}
