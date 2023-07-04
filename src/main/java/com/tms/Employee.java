package com.tms;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component //разрешает спрингу управлять обьектами Employee
public class Employee {
    private Integer id;
    private String username;
    private Integer age;

    @PostConstruct
    public void init(){
        System.out.println("Init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy method");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
