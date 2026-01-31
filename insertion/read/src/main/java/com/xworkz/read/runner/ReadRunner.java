package com.xworkz.read.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ReadRunner {
    public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("getData");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
//            BakeryEntity bakeryEntity = new BakeryEntity(10,
//                    "Fruity", 20D, "Mango");
        com.xworkz.insertion.entity.BakeryEntity bakeryEntity1=entityManager.find(com.xworkz.insertion.entity.BakeryEntity.class,1);
        //entityManager.persist(bakeryEntity);

        System.out.println(bakeryEntity1.toString());
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
}
}