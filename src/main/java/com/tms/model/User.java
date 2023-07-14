package com.tms.model;


import jakarta.validation.constraints.*;
import lombok.Data;


import java.util.Date;

@Data
public class User {      //POJO - Plane old java object

    @NotNull
    private Integer id;

    @Pattern(regexp = "[A-Z][A-z]*")
    @Size(min = 3,max = 5)
    private String firstName;
    private String secondName;
    private String login;
    private String password;

    @Min(18)
    @Max(120)
    private Integer age;

    @Email
    private String email;
    private Boolean isDeleted;
    private Date registrationDate;
}
