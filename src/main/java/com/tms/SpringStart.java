package com.tms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


    //с какой папки начинать вычитывать все классы
public class SpringStart {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Employee employee = context.getBean("employee", Employee.class);
        ((ConfigurableApplicationContext) context).close();
    }
}
