package com.xworkz.grozzery.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grozzeryEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GrozzeryEntity {
    @Id
    private int id;
    private String productName;
    private double amount;
    private Long mobileNumber;

}
