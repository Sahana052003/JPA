package com.xworkz.hostel.service;

import com.xworkz.hostel.dto.HostelDTO;
import com.xworkz.hostel.entity.HostelEntity;
import com.xworkz.hostel.repository.HostelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HostelServiceImpl implements HostelService{

    @Autowired
    HostelRepository hostelRepository;


    @Override
    public void checkData(HostelDTO hostelDTO) {
        System.out.println("Service details : " + hostelDTO);
        HostelEntity hostelEntity=new HostelEntity();
        hostelEntity.setName(hostelDTO.getName());
        hostelEntity.setAddress(hostelDTO.getAddress());
        hostelEntity.setMobileNumber(hostelDTO.getMobileNumber());
        hostelEntity.setFees(hostelDTO.getFees());
        hostelEntity.setUsn(hostelDTO.getUsn());
        hostelRepository.confirmData(hostelEntity);
    }
}
