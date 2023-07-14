package com.tms.model;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NonNull;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class User {      //POJO - Plane old java object

    @Null // пройдет если в поле null
    @NotNull // пройдет если в поле не null
    @Min(5) // не меньше 5
    @Max(10) // не больше 10
    @Digits(integer = 1, fraction = 10) //TODO: check
    private Integer id; // null

    @NotEmpty // в строке что-то есть
    @NotBlank // в строке что-то есть и не пустая
    private String firstName;
    private String secondName;
    
    @Pattern(regexp = "[A-z]{5}")
    private String login;
    
    private String password;
    
    @NegativeOrZero
    @Negative
    @Positive
    @PositiveOrZero
    private Integer age;

    @Email
    private String email;

    @AssertFalse // false
    @AssertTrue // true
    private Boolean isDeleted;

    @Future
    @Past
    @FutureOrPresent
    private Date registrationDate;
}
