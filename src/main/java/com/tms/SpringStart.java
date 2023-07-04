package com.tms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStart {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-settings.xml");
        Employee employee = context.getBean("employee-bean", Employee.class);

        System.out.println(employee);
    }
}
