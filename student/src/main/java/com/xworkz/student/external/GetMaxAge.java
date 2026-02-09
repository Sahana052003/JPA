package com.xworkz.student.external;

import javax.persistence.*;

public class GetMaxAge {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();


        Query getMaxAge = entityManager.createNamedQuery("getMaxAge");
        Object singleResult = getMaxAge.getSingleResult();
        //Integer in=(Integer) getMaxAge.getSingleResult();
        System.out.println(singleResult);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
