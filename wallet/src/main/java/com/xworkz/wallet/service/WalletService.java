package com.xworkz.wallet.service;

import com.xworkz.wallet.dto.WalletDTO;

import java.util.List;

public interface WalletService {
    boolean loginDetails(WalletDTO walletDTO);
    List<WalletDTO> getDtos();
}
