package com.xworkz.student.external;

import javax.persistence.*;

public class GetMinAge {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Query getMinAge = entityManager.createNamedQuery("getMinAge");
        Object singleResult = getMinAge.getSingleResult();
        System.out.println(singleResult);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
