package com.xworkz.student.external;

import javax.persistence.*;

public class GetCount {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Query getCount = entityManager.createNamedQuery("getCount");
        Object singleResult = getCount.getSingleResult();
        //Long sn=(Long) getCount.getSingleResult();
        System.out.println(singleResult);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
