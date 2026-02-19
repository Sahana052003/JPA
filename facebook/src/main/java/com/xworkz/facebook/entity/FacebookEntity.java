package com.xworkz.facebook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="facebook_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "readData",query = "select fb from FacebookEntity fb")
public class FacebookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String email;
    private String password;
    private Long mobileNumber;
}
