package com.xworkz.company.dao;

import com.xworkz.company.entity.CompanyEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class CompanyDAOImpl implements CompanyDAO {
    @Override
    public void saveData(CompanyEntity companyEntity) {
        System.out.println("Saved Details are : " + companyEntity);


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("register");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(companyEntity);
            transaction.commit();
            // System.out.println("Data Saved Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public List<CompanyEntity> getCompanyData() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("register");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("data");
            List<CompanyEntity> list = (List<CompanyEntity>)query.getResultList();
            System.out.println(list);
            return list;
//            list.forEach();
        } catch (Exception e) {
           return Collections.emptyList();
        } finally {
            entityManager.close();
            entityManager.close();


        }
    }
}
