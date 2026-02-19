package com.xworkz.upgrade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UpGradeController {
    public UpGradeController(){
        System.out.println("UpGradeController is Called");
    }




    //This is for home page index.jsp
    @GetMapping("/")
    public String showHomePage(){
        return "index";
    }



    //This is for index.jsp file here when a user click a Log In button
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }


    @PostMapping("/loginData")
    public String showLoginPage(){
        return "login";
    }


    //This is for index.jsp file here when a user click a register button it will sen to the register.jsp page
    @GetMapping("/register")
    public String showRegisterPage(){
        return "register";
    }

    //This is for register.jsp file here user entered a data
    @PostMapping("/registerData")
    public String saveRegisterPage(){
        return "register";
    }

}
