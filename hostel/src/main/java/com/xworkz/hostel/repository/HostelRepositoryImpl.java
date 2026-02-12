package com.xworkz.hostel.repository;

import com.xworkz.hostel.entity.HostelEntity;
import org.springframework.stereotype.Repository;

@Repository
public class HostelRepositoryImpl implements HostelRepository{
    @Override
    public void confirmData(HostelEntity hostelEntity) {
        System.out.println("HostelRepository is Called : " + hostelEntity);
    }
}
