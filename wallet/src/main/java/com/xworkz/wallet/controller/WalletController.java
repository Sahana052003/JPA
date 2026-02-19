package com.xworkz.wallet.controller;


import com.xworkz.wallet.dto.WalletDTO;
import com.xworkz.wallet.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class WalletController {
    public WalletController(){
        System.out.println("WalletController is Called");
    }

    @Autowired
    WalletService walletService;

    @PostMapping("saveWallet")
    public String walletData(WalletDTO walletDTO,Model model){
        boolean validate = walletService.loginDetails(walletDTO);
        System.out.println("Data entered in the LoginPage : " + walletDTO);


        if(validate){
            model.addAttribute("msg","Registered");
            model.addAttribute("color","green");
        }else {
            model.addAttribute("msg","Failed to register");
            model.addAttribute("color","red");
        }
        return "index";
    }


    @GetMapping("getWalletDetails")
    public String getWalletDetails(Model model){
        List<WalletDTO> walletDTOS=walletService.getDtos();
        model.addAttribute("walletData",walletDTOS);
        return "wallet";
    }
}
