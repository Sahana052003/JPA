package com.xworkz.whatsapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="whatsapp_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WhatsappEntity {
    @Id
    private int id;
    private String name;
    private Long mobileNumber;

}
