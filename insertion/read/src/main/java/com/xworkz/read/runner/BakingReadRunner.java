package com.xworkz.read.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BakingReadRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("getData");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        com.xworkz.insertion.entity.BakeryEntity bakeryEntity1=entityManager.find(com.xworkz.insertion.entity.BakeryEntity.class,2);

        System.out.println(bakeryEntity1.toString());
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
