package com.xworkz.wallet.repository;

import com.xworkz.wallet.entity.WalletEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class WalletRepositoryImpl implements WalletRepository {

    @Override
    public void save(WalletEntity wallet) {

        System.out.println("Saved Wallet Details: " + wallet);

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("amount");

        EntityManager entityManager =
                entityManagerFactory.createEntityManager();

        try {
            EntityTransaction transaction = entityManager.getTransaction();

            transaction.begin();
            entityManager.persist(wallet);
            transaction.commit();

            System.out.println("Wallet Data Saved Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public List<WalletEntity> getAllWallets() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("amount");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            EntityTransaction transaction =
                    entityManager.getTransaction();

            transaction.begin();

            Query query = entityManager.createNamedQuery("ReadData");

            List<WalletEntity> list =(List<WalletEntity>) query.getResultList();

            System.out.println(list);

            return list;

        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
