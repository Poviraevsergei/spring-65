package com.tms;

import org.springframework.stereotype.Component;

@Component(value = "employee-bean") //разрешает спрингу управлять обьектами Employee
public class Employee {
    private Integer id;
    private String username;
    private Integer age;
}
