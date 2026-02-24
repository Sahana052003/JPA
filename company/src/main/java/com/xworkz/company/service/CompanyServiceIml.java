package com.xworkz.company.service;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dto.CompanyDTO;
import com.xworkz.company.entity.CompanyEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CompanyServiceIml implements CompanyService {

    @Autowired
    CompanyDAO companyDAO;


    @Override
    public boolean register(CompanyDTO companyDTO) {

        String firstName = companyDTO.getFirstName();
        String lastName = companyDTO.getLastName();
        String email = companyDTO.getEmail();
        String password = companyDTO.getPassword();
        String companyName = companyDTO.getCompanyName();
        Long mobile = companyDTO.getMobileNumber();

        String pwd = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{6,}$";
        String phoneNumber = "^[6-9][0-9]{9}$";
        if (firstName != null && firstName.length() >= 4 &&
                lastName != null && lastName.length() >= 1 &&
                email != null && email.endsWith("@gmail.com") &&
                password != null && password.matches(pwd) &&
                companyName != null && !companyName.trim().isEmpty() &&
                mobile != null && String.valueOf(mobile).matches(phoneNumber)
        ) {

            CompanyEntity entity = new CompanyEntity();
            BeanUtils.copyProperties(companyDTO,entity);

            companyDAO.saveData(entity);
            return true;

        } else {
            return false;
        }

    }

    @Override
    public List<CompanyDTO> getDtos() {
        List<CompanyEntity> companyData = companyDAO.getCompanyData();




        if (!companyData.isEmpty()) {

            List<CompanyDTO> companyDTOList = new ArrayList<>();
          companyData.forEach(entities->
            {
                CompanyDTO companyDTO = new CompanyDTO();

                BeanUtils.copyProperties(entities,companyDTO);

                companyDTOList.add(companyDTO);
            });
            return companyDTOList;
        } else {
            return Collections.emptyList();
        }
    }
}