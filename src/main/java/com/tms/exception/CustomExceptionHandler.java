package com.tms.exception;

import java.io.IOException;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class CustomExceptionHandler {

    //отлавливает исключения в этом контроллере NullPointerException и IOException и обрабатывает
    @ExceptionHandler({NullPointerException.class, IOException.class})
    public String myExceptionHandler(Exception e){
        System.out.println(e);
        return "unsuccess";
    }
}
