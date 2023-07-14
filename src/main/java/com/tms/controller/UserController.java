package com.tms.controller;

import com.tms.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

//TODO: validation don't work?

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get-user")
    public String getUser(@Valid @ModelAttribute User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            System.out.println(bindingResult.getAllErrors());
            return "unsuccess";
        }
        System.out.println(user);
        return "success";
    }
}
