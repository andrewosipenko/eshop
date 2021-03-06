package com.eshop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SimpleAnnotatedAspect {

    @Pointcut("execution(public * * (..))")
    private void anyPublicOperation(){}

    public void call() throws Throwable{
        System.out.println("Hello from annotated aspect!");
    }
}
