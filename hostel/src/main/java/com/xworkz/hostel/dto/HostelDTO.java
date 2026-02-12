package com.xworkz.hostel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HostelDTO {
    private String name;
    private String address;
    private Long mobileNumber;
    private Double fees;
    private Character usn;
}
