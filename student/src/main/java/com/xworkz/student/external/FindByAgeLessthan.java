package com.xworkz.student.external;

import javax.persistence.*;
import java.util.List;

public class FindByAgeLessthan {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Query findByAgeGreater = entityManager.createNamedQuery("findByAgelessthan");
        List resultList = findByAgeGreater.getResultList();
        resultList.forEach(age-> System.out.println(age));



        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
