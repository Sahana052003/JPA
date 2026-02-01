package com.xworkz.whatsapp.runner;

import com.xworkz.whatsapp.entity.WhatsappEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class WhatsappRunner {
    public static void main(String[] args) {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("message");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            WhatsappEntity whatsapp=new WhatsappEntity(2,"Kavya",6734201638L);
            WhatsappEntity whatsapp1=entityManager.find(WhatsappEntity.class,1);
            System.out.println(whatsapp1.toString());
            entityManager.persist(whatsapp);
            transaction.commit();

    }
}
