package com.xworkz.loginform.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "login_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginFormEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    private Long phoneNumber;
    private String address;
}
