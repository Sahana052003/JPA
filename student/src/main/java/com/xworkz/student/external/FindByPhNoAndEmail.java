package com.xworkz.student.external;

import javax.persistence.*;

public class FindByPhNoAndEmail {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();


        Query findByphNoandEmail = entityManager.createNamedQuery("findByphNoandEmail");
        findByphNoandEmail.setParameter("mobileNumber",9562819462L);
        findByphNoandEmail.setParameter("emailby","nandu@gmail.com");
        Object singleResult = findByphNoandEmail.getSingleResult();
        System.out.println(singleResult);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
