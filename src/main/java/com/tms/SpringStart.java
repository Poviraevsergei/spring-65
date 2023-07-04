package com.tms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.tms")    //с какой папки начинать вычитывать все классы
public class SpringStart {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringStart.class);
        Employee employee = context.getBean("employee", Employee.class);

        System.out.println(employee.hashCode());
    }

    @Bean(value = "employee")
    public static Employee employeeBean(){
        return new Employee();
    }
}
