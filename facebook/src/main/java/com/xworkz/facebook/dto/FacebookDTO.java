package com.xworkz.facebook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacebookDTO {
    private String username;
    private String email;
    private String password;
    private Long mobileNumber;
}
