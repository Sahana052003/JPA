package com.xworkz.games.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Runner {
    public static void main(String[] args) {
EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Kabaddi");
EntityManager entityManager = entityManagerFactory.createEntityManager();
EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        if (entityManagerFactory!=null){
        System.out.println("Data is saved");
        }else {
                System.out.println("Data is Not saved");
        }
                }
                }

