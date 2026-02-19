package com.xworkz.wallet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="wallet_tb")
@AllArgsConstructor
@NoArgsConstructor

@NamedQuery(name = "ReadData",query = "select entity from WalletEntity entity ")
public class WalletEntity {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double balance;
    private String currency;
    private Long mobileNumber;
}
