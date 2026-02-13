package com.xworkz.company.controller;


import com.xworkz.company.dto.CompanyDTO;
import com.xworkz.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CompanyController {

    @Autowired
    CompanyService companyService;


    public CompanyController(){
        System.out.println("CompanyController is Called");
    }

    @PostMapping("/loginPage")
    public String loginPage(CompanyDTO companyDTO, Model model){
        companyService.register(companyDTO);
        System.out.println("Data entered in the LoginPage : " + companyDTO);
        boolean isRegistered = companyService.register(companyDTO);
        if (isRegistered) {
            model.addAttribute("message", "Registration Successful!");
            model.addAttribute("color", "green");
        } else {
            model.addAttribute("message", "Failed to Register! Please check your input.");
            model.addAttribute("color", "red");
        }



        model.addAttribute("companyDTO", companyDTO);
        return "index";
    }
}
