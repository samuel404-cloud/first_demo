package com.example.demo.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandlerInvocationHandler implements InvocationHandler {
    private static final Logger log = LoggerFactory.getLogger(LogHandlerInvocationHandler.class);

    private Object target;

    public LogHandlerInvocationHandler(Object o) {
        this.target = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("before invoke");
        Object invoke = method.invoke(target, args);
        log.info("after invoke");
        return invoke;
    }
}
