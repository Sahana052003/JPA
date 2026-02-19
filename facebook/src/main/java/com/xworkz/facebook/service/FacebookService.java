package com.xworkz.facebook.service;

import com.xworkz.facebook.dto.FacebookDTO;

import java.util.List;

public interface FacebookService {
    boolean validData(FacebookDTO facebookDTO);

    List<FacebookDTO> getCompanyDtos();
}
