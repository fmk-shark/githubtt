package com.crmxiangmu.util;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionInvocationHandler implements InvocationHandler {
    private Object target;

    public TransactionInvocationHandler() {
    }

    public TransactionInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SqlSession session = null;
        Object obj = null;

        try {
            session = SqlsessionUtil.getSqlsession();

            //处理业务逻辑
            //method.invoke 为target对象的表白
            obj = method.invoke(target,args);

                    //处理业务逻辑之后，提交事务
            session.commit();
        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        }finally {
            SqlsessionUtil.removeSqlsession(session);
        }
    return obj;
    }

    public  Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
