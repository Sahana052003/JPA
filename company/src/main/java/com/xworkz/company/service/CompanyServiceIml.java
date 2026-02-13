package com.xworkz.company.service;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dto.CompanyDTO;
import com.xworkz.company.entity.CompanyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceIml implements CompanyService {

    @Autowired
    CompanyDAO companyDAO;


    @Override
    public boolean register(CompanyDTO companyDTO) {
        System.out.println("CompanyServiceIml is Called " + companyDTO);


        if (companyDTO.getFName() == null && companyDTO.getFName().length() >= 4 && companyDTO.getFName().isEmpty()
                && companyDTO.getLName() == null && companyDTO.getLName().length() >= 1 &&
                companyDTO.getEmail() == null && companyDTO.getEmail().length() >= 15 && companyDTO.getEmail().contains("@gmail.com") &&
                companyDTO.getPassword() == null && companyDTO.getPassword().length() >= 5 &&
                companyDTO.getCompanyName() == null && companyDTO.getCompanyName().isEmpty() &&
                companyDTO.getMobileNumber() == null && String.valueOf(companyDTO.getMobileNumber()).length() != 10) {
            return false;
        }

            CompanyEntity companyEntity = new CompanyEntity();
            companyEntity.setFName(companyDTO.getFName());
            companyEntity.setLName(companyDTO.getLName());
            companyEntity.setEmail(companyDTO.getEmail());
            companyEntity.setPassword(companyDTO.getPassword());
            companyEntity.setCompanyName(companyDTO.getCompanyName());
            companyEntity.setMobileNumber(companyDTO.getMobileNumber());
            companyDAO.saveData(companyEntity);
        return true;
        }
    }
