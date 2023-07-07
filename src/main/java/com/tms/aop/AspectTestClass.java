package com.tms.aop;

import com.tms.annotations.AspectAnnotation;
import org.springframework.stereotype.Component;

@Component
public class AspectTestClass {

    @AspectAnnotation
    public void printOne() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("One");
    }

    public int returnTen() {
        return 10;
    }
}