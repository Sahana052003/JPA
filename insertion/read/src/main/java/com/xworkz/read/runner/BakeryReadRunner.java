package com.xworkz.read.runner;

import com.xworkz.insertion.entity.BakeryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BakeryReadRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("getData");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
//            BakeryEntity bakeryEntity = new BakeryEntity(10,
//                    "Fruity", 20D, "Mango");
            BakeryEntity bakeryEntity1=entityManager.find(BakeryEntity.class,3);
            //entityManager.persist(bakeryEntity);

            System.out.println(bakeryEntity1.toString());
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}