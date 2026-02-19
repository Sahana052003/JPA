package com.xworkz.company.service;

import com.xworkz.company.dto.CompanyDTO;
import com.xworkz.company.entity.CompanyEntity;

import java.util.List;

public interface CompanyService {
    boolean register(CompanyDTO companyDTO);


    List<CompanyDTO> getDtos();
}
