package com.example.demo.Interface.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//@Constraint(ParameterValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface ValidateParamListLength {
}
