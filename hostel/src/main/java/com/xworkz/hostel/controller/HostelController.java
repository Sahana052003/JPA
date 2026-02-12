package com.xworkz.hostel.controller;

import com.xworkz.hostel.dto.HostelDTO;
import com.xworkz.hostel.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HostelController {


@Autowired
    HostelService hostelService;



    public HostelController(){
        System.out.println("HostelController is called");
    }


    @PostMapping("/information")
    public String enterDetails(HostelDTO hostelDTO){
        hostelService.checkData(hostelDTO);
        System.out.println("Details are entered " + hostelDTO);
        return "hostel";
    }
}
