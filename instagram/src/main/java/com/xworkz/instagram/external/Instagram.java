package com.xworkz.instagram.external;

import javax.persistence.*;
import java.util.List;

public class Instagram {
        public static void main(String[] args) {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("details");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();

//

            Query findByAgelessthan = entityManager.createNamedQuery("findByAgelessthan");
            List resultList = findByAgelessthan.getResultList();
            resultList.forEach(age-> System.out.println(age));

            transaction.commit();
            entityManager.close();
            entityManagerFactory.close();
        }
    }

