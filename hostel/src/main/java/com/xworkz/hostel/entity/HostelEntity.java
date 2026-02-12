package com.xworkz.hostel.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "hostel_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HostelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private Long mobileNumber;
    private Double fees;
    private Character usn;
}
