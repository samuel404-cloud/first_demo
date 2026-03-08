package com.example.demo.Interface.anotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ValidateParamListLengthAspect {
    @Pointcut("@annotation(com.example.demo.Interface.anotation.ValidateParamListLength)")
    public void pointFn(){};

    @Around("pointFn()")
    public void beforeRequest(ProceedingJoinPoint joinPoint) throws Throwable {
//        Object[] args = joinPoint.getArgs();
//        UserVO arg = (UserVO) args[0];
//        if (arg.getFriendList().size()>1) {
//            log.error("拦截");
//            return;
//        }
//        log.info("放行");
        joinPoint.proceed();
    }
}
