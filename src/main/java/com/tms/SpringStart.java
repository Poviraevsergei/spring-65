package com.tms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringStart {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.getHrManager().name);
    }
}
