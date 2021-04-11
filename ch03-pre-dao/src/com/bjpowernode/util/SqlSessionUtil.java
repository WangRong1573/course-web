package com.bjpowernode.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/11
 **/

public class SqlSessionUtil {
    private static SqlSessionFactory sqlSessionFactory;
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();
    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public SqlSession getSession(){
        SqlSession session = threadLocal.get();
        if (session == null){
            session = sqlSessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }

    public static void myClose(SqlSession sqlSession){
        if (sqlSession != null){
            sqlSession.close();
            threadLocal.remove();
        }
    }
}
