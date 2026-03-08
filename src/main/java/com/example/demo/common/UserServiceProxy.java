package com.example.demo.common;

import lombok.extern.java.Log;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserServiceProxy implements MethodInterceptor {
    private static final Logger log = LoggerFactory.getLogger(UserServiceProxy.class);

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("come in now");
        return null;
    }
}
