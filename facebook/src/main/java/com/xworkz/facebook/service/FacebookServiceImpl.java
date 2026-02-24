package com.xworkz.facebook.service;

import com.xworkz.facebook.dao.FacebookDAO;
import com.xworkz.facebook.dto.FacebookDTO;
import com.xworkz.facebook.entity.FacebookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class FacebookServiceImpl implements FacebookService {

    @Autowired
     FacebookDAO facebookDAO;

    @Override
    public boolean validData(FacebookDTO facebookDTO) {

        String username = facebookDTO.getUsername();
        String email = facebookDTO.getEmail();
        String password = facebookDTO.getPassword();
        String mobile = String.valueOf(facebookDTO.getMobileNumber());

        String pwdPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{6,}$";
        String phonePattern = "^[6-9][0-9]{9}$";

        if (username != null && username.length() >= 4 &&
                email != null && email.endsWith("@gmail.com") &&
                password != null && password.matches(pwdPattern) &&
                mobile != null && mobile.matches(phonePattern)) {

            FacebookEntity entity = new FacebookEntity();
            entity.setUsername(facebookDTO.getUsername());
            entity.setEmail(facebookDTO.getEmail());
            entity.setPassword(facebookDTO.getPassword());
            entity.setMobileNumber(facebookDTO.getMobileNumber());

            facebookDAO.saveData(entity);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<FacebookDTO> getCompanyDtos() {
        List<FacebookEntity> facebookData = facebookDAO.getFacebookData();

        if (!facebookData.isEmpty()) {
            List<FacebookDTO> facebookDTOList = new ArrayList<>();

            facebookData.forEach(entity -> {
                FacebookDTO dto = new FacebookDTO();
                dto.setUsername(entity.getUsername());
                dto.setEmail(entity.getEmail());
                dto.setPassword(entity.getPassword());
                dto.setMobileNumber(entity.getMobileNumber());

                facebookDTOList.add(dto);
            });
            return facebookDTOList;
        } else {
            return Collections.emptyList();
        }
    }
}
