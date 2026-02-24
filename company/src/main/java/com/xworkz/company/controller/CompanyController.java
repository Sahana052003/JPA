package com.xworkz.company.controller;


import com.xworkz.company.dto.CompanyDTO;
import com.xworkz.company.entity.CompanyEntity;
import com.xworkz.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CompanyController {

    @Autowired
    CompanyService companyService;


    public CompanyController() {
        System.out.println("CompanyController is Called");
    }

    @PostMapping("/loginPage")
    public String loginPage(CompanyDTO companyDTO, Model model) {
        boolean register = companyService.register(companyDTO);
        System.out.println("Data entered in the LoginPage : " + companyDTO);
////        model.addAttribute("dto","Registered Successfully");
////        return "register";






//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("msg", companyDTO);
//        modelAndView.setViewName("register");
//        return modelAndView;


        if(register){
            model.addAttribute("message","Register Successfully");
            model.addAttribute("color","green");
        }else {
            model.addAttribute("message","Failed to Register");
            model.addAttribute("color","red");
        }
        return "index";
    }




    @GetMapping("data")
    public String getDetails(Model model){
        List<CompanyDTO> dtos = companyService.getDtos();
        model.addAttribute("hello",dtos);
        return "information";
    }
    }
