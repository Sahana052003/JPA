package com.xworkz.student.external;

import javax.persistence.*;
import java.util.List;

public class GetAllNameList {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Query getNameList = entityManager.createNamedQuery("getNameList");
//        List resultList = getNameList.getResultList();
//        System.out.println(resultList);

        List<String> name=getNameList.getResultList();
        name.forEach(ad-> System.out.println(ad));
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
