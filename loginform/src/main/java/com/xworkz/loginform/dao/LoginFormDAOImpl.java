package com.xworkz.loginform.dao;

import com.xworkz.loginform.entity.LoginFormEntity;
import org.springframework.stereotype.Repository;

@Repository

public class LoginFormDAOImpl implements LoginFormDAO{
    @Override
    public void registered(LoginFormEntity loginFormEntity) {
        System.out.println("LoginFormDAO : " + loginFormEntity);
    }
}
