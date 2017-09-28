package com.fangminx.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * //匹配任何公共方法
 @Pointcut("execution(public * com.fangminx.service.*.*(..))")

 //匹配com.fangminx包及子包下Service类中无参方法
 @Pointcut("execution(* com.fangminx..*Service.*())")

 //匹配com.fangminx包及子包下Service类中的任何只有一个参数的方法
 @Pointcut("execution(* com.fangminx..*Service.*(*))")

 //匹配com.fangminx包及子包下任何类的任何方法
 @Pointcut("execution(* com.fangminx..*.*(..))")

 //匹配com.fangminx包及子包下返回值为String的任何方法
 @Pointcut("execution(String com.fangminx..*.*(..))")

 //匹配异常
 execution(public * com.fangminx.service.*.*(..) throws java.lang.IllegalAccessException)

 */
@Aspect
@Component
public class ExecutionAspectConfig {

 @Pointcut("execution(public * com.fangminx.service..*Service.*(..) throws java.lang.IllegalAccessException)")
 public void matchCondition(){}

 @Before("matchCondition()")
 public void before(){
  System.out.println("");
  System.out.println("###before");
 }

}
