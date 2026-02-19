package com.xworkz.facebook.controller;

import com.xworkz.facebook.dao.FacebookDAO;
import com.xworkz.facebook.dto.FacebookDTO;
import com.xworkz.facebook.service.FacebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class FacebookController {
    public FacebookController(){
        System.out.println("FacebookController is Called");
    }

    @Autowired
    FacebookService facebookService;


    @PostMapping("formData")
    public String loginForm(FacebookDTO facebookDTO, Model model){
        boolean checkData = facebookService.validData(facebookDTO);
        System.out.println("Data of FaceBook is : " + facebookDTO);

        if(checkData){
            model.addAttribute("info","Login Successfully!!");
            model.addAttribute("color","green");
        }else{
            model.addAttribute("info","Failed to Login ");
            model.addAttribute("color","red");
        }
        return "index";
    }


    @GetMapping("facebookData")
    public String getData(Model model){
        List<FacebookDTO> dto=facebookService.getCompanyDtos();
        model.addAttribute("message",dto);
        return "facebook";
    }
}
