package com.bjpowernode.util;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/11
 **/

public class ServiceFactory {
    //获取代理类对象
    public static Object getProxy(Object service){
        return new TransactionInvocationHandler(service).getProxy();
    }
}
