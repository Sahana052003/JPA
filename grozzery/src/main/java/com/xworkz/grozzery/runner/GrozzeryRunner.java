package com.xworkz.grozzery.runner;

import com.xworkz.grozzery.entity.GrozzeryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GrozzeryRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("supermarket");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        GrozzeryEntity grozzery=new GrozzeryEntity(2,"Mobiles",150,6383194693L);
        GrozzeryEntity grozzery1 = entityManager.find(GrozzeryEntity.class, 1);
        entityManager.persist(grozzery);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
