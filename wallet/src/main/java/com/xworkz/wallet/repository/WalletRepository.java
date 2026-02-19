package com.xworkz.wallet.repository;

import com.xworkz.wallet.entity.WalletEntity;
import java.util.List;
import com.xworkz.wallet.repository.WalletRepository;

public interface WalletRepository {

    void save(WalletEntity wallet);

    List<WalletEntity> getAllWallets();
}
