package com.fangminx.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * //匹配ProductService类里头的所有方法
 * @Pointcut("within(com.fangminx.service.ProductService)")
 * //匹配com.fangminx包及子包下所有类的方法
 * @Pointcut("within(com.fangminx..*)")
 */
@Aspect
@Component
public class PkgTypeAspectConfig {
    @Pointcut("within(com.fangminx.service.sub.*)")
    public void matchType(){}

    @Before("matchType()")
    public void before(){
        System.out.println("");
        System.out.println("###before");
    }
}
