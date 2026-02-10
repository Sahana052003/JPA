package com.xworkz.linkedin.DAO;

import com.xworkz.linkedin.entity.LinkedinEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class LinkedInimp implements LinkedInDAO{

    @Override
    public boolean save(LinkedinEntity linkedinEntity) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("login");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(linkedinEntity);
        transaction.commit();
        entityManager.close();
        return true;
    }



}
