package com.tms.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Aspect //говорит о том что класс будет аспектом
@Component
public class MyFirstAspect {
    //Pointcut - срез Join point'ов
    //Advice - в какой момент выполнения метода

    //Pointcut - срез Join point'ов
    @Pointcut(value = "execution(public * com.tms.aop.*.*())")
    void emptyMethod() {
    }

    @After("emptyMethod()")
    public void checkPointcut() {
        System.out.println("Pointcut work!");
    }

         @Before(value = "@annotation(com.tms.annotations.AspectAnnotation)" ) //перед вполнением метода
        public void startTimeEvent(JoinPoint joinPoint) { //joinPoint - точка где работает аспект
            System.out.println(LocalTime.now() + " " + joinPoint.getSignature().getName() + " method start working ...");
        }

       @After(value = "execution(public * com.tms.aop.*.*())") //перед вполнением метода
        public void endTimeEvent(JoinPoint joinPoint) { //joinPoint - точка где работает аспект
            System.out.println(LocalTime.now() + " " + joinPoint.getSignature().getName() + " method finish work ...");
        }

/*        @Around(value = "within(com.tms.aop.*) || within(com.tms.service.*)")
        public Object aroundExampleMethod(ProceedingJoinPoint joinPoint) throws Throwable {
            System.out.println("Method started " + joinPoint.getSignature().getName());
            Object returnValue = joinPoint.proceed();
            System.out.println("Method finished " + joinPoint.getSignature().getName());
            return returnValue;
        }*/


    @AfterThrowing(value = "within(com.tms.aop.*)", throwing = "err")
    public void printAfterThrow(Throwable err) {
        System.out.println(LocalTime.now() + err.toString());
    }

    @AfterReturning(value = "within(com.tms.aop.*)", returning = "retValue")
    public void returned(Object retValue) {
        System.out.println("Print return value from aspect: " + retValue);
    }

    @Around(value = "@annotation(com.tms.annotations.AspectAnnotation)")
    public Object aroundExampleMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        LocalTime startTime = LocalTime.now();
        Object returnValue = joinPoint.proceed();
        LocalTime endTime = LocalTime.now();
        System.out.println("Method worked " + (endTime.getNano() - startTime.getNano()));
        return returnValue;
    }
}