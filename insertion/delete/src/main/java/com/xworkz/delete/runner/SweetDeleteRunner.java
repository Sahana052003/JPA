package com.xworkz.delete.runner;

import com.xworkz.delete.entity.BakeryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SweetDeleteRunner {
        public static void main(String[] args) {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("getDelete");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            BakeryEntity bakery = entityManager.find(BakeryEntity.class, 7);

            if (bakery != null) {
                entityManager.remove(bakery);
                System.out.println("Data is deleted in table");
            } else {
                System.out.println("Data not found");
            }
            transaction.commit();
            entityManager.close();
            entityManagerFactory.close();
        }
    }

