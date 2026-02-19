package com.xworkz.wallet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WalletDTO {
    private String name;
    private Double balance;
    private String currency;
    private Long mobileNumber;
}
