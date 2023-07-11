package com.tms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller /** делает класс контроллером */
@RequestMapping("/main-path") //буде перед всеми путями методов
public class HelloController {

    @GetMapping("/hello/{number}")
    public String getHelloPage(@PathVariable int number){
        System.out.println(number);
        //logic(Service -> Repository)
        return "HelloMVC";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getSecondHelloPage(@RequestParam("number") int number){
        System.out.println(number);
        //logic(Service -> Repository)
        return "HelloMVC";
    }
}