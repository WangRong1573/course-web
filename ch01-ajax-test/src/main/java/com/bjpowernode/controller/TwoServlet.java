package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/10
 **/

public class TwoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student stu = new Student(1001, "mike", 20);
        //{"id":?,"name":"?","age":?}
        String json = "{\"id\":"+stu.getId()+",\"name\":\""+stu.getName()+"\",\"age\":"+stu.getAge()+"}";
        resp.getWriter().print(json);
    }
}
