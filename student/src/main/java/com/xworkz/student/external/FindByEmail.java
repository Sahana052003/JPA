package com.xworkz.student.external;

import javax.persistence.*;

public class FindByEmail {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();


        Query findByEmaill = entityManager.createNamedQuery("FindByEmaill");
        findByEmaill.setParameter("emailby","nandu@gmail.com");
        Object singleResult = findByEmaill.getSingleResult();
        System.out.println(singleResult);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
