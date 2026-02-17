package com.xworkz.company.controller;


import com.xworkz.company.dto.CompanyDTO;
import com.xworkz.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CompanyController {

    @Autowired
    CompanyService companyService;


    public CompanyController(){
        System.out.println("CompanyController is Called");
    }

    @PostMapping("/loginPage")
    public ModelAndView loginPage(CompanyDTO companyDTO, Model model){
        companyService.register(companyDTO);
        System.out.println("Data entered in the LoginPage : " + companyDTO);
//        model.addAttribute("dto","Registered Successfully");
//        return "register";
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("dto",companyDTO );
        modelAndView.setViewName("register");
        return modelAndView;
    }
}
