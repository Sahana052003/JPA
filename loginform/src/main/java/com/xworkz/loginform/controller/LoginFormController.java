package com.xworkz.loginform.controller;


import com.xworkz.loginform.dto.LoginFormDTO;
import com.xworkz.loginform.service.LoginFormService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginFormController {


    @Autowired
    LoginFormService loginFormService;


    public LoginFormController(){
        System.out.println("LoginFormController is created");
    }


    @PostMapping("/login")
    public String login(LoginFormDTO loginFormDTO){
        loginFormService.details(loginFormDTO);
        System.out.println("Data is Entered : " + loginFormDTO);
        return "form";
    }
}
