package com.xworkz.loginform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginFormDTO {


    private String name;
    private String email;
    private String password;
    private Long phoneNumber;
    private String address;


}
