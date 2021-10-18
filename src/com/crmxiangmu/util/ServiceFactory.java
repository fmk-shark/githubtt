package com.crmxiangmu.util;

public class ServiceFactory {
    public static Object getservice(Object obj){

        return new TransactionInvocationHandler(obj).getProxy();

    }



}
