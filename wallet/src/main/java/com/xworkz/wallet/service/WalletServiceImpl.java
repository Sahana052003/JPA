package com.xworkz.wallet.service;

import com.xworkz.wallet.dto.WalletDTO;
import com.xworkz.wallet.entity.WalletEntity;
import com.xworkz.wallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    WalletRepository walletRepository;

    @Override
    public boolean loginDetails(WalletDTO walletDTO) {

        String name = walletDTO.getName();
        Double balance = walletDTO.getBalance();
        String currency = walletDTO.getCurrency();
        Long mobileNumber = walletDTO.getMobileNumber();

        String phonePattern = "^[6-9][0-9]{9}$";

        if (name != null && name.length() >= 5 &&
                balance != null && balance >= 0 &&
                currency != null &&
                (currency.equals("INR") || currency.equals("USD") || currency.equals("EUR")) &&
                mobileNumber != null &&
                String.valueOf(mobileNumber).matches(phonePattern)) {

            WalletEntity entity = new WalletEntity();
            entity.setName(walletDTO.getName());
            entity.setBalance(walletDTO.getBalance());
            entity.setCurrency(walletDTO.getCurrency());
            entity.setMobileNumber(walletDTO.getMobileNumber());

            walletRepository.save(entity);

            return true;
        } else {
            return false;
        }
    }

        @Override
        public List<WalletDTO> getDtos() {

            List<WalletEntity> walletEntities =
                    walletRepository.getAllWallets();

            if (!walletEntities.isEmpty()) {

                List<WalletDTO> walletDTOList = new ArrayList<>();

                walletEntities.forEach(entity -> {

                    WalletDTO dto = new WalletDTO();


                    dto.setName(entity.getName());
                    dto.setBalance(entity.getBalance());
                    dto.setCurrency(entity.getCurrency());
                    dto.setMobileNumber(entity.getMobileNumber());

                    walletDTOList.add(dto);
                });

                return walletDTOList;

            } else {
                return Collections.emptyList();
            }
        }
    }

