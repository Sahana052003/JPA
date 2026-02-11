package com.xworkz.loginform.service;

import com.xworkz.loginform.dao.LoginFormDAO;
import com.xworkz.loginform.dto.LoginFormDTO;
import com.xworkz.loginform.entity.LoginFormEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginFormImpl implements LoginFormService{
    @Autowired
    LoginFormDAO loginFormDAO;

    @Override
    public void details(LoginFormDTO loginFormDTO) {
        System.out.println("Service details : " + loginFormDTO);
        LoginFormEntity loginFormEntity=new LoginFormEntity();
        loginFormEntity.setName(loginFormDTO.getName());
        loginFormEntity.setEmail(loginFormDTO.getEmail());
        loginFormEntity.setPassword(loginFormDTO.getPassword());
        loginFormEntity.setPhoneNumber(loginFormDTO.getPhoneNumber());
        loginFormEntity.setAddress(loginFormDTO.getAddress());
        loginFormDAO.registered(loginFormEntity);
    }
}
