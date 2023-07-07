package com.tms;

import com.tms.aop.AspectTestClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy //активирует АОП
@ComponentScan("com.tms") //с какой папки начинать вычитывать все классы
public class SpringStart {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringStart.class);
        AspectTestClass aspectTestClass = context.getBean("aspectTestClass", AspectTestClass.class);
        aspectTestClass.printOne();
        aspectTestClass.returnTen();
    }
}
