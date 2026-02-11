package com.xworkz.twitter.external;

import com.xworkz.twitter.entity.TwitterEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Twitter {
    public static <list> void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("twitter");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();


//        list.add(new TwitterEntity("Nandushree","nandu3@gmail.com",8923561848L));
//        list.add(new TwitterEntity("Muktha","muktha4@gmail.com",4639174839L));
//        list.add(new TwitterEntity("Bindhu","bindu7@gmail.com",7823198473L));
//        list.add(new TwitterEntity("Indhu","indusri4@gmail.com",7892375829L));
//        for (TwitterEntity entity:list) {
//            entityManager.persist(entity);
//        }
//
//
//        TwitterEntity twitter=entityManager.find(TwitterEntity.class,"Indhu");
//        System.out.println(twitter.toString());

        List<TwitterEntity> list=new ArrayList<>();

        Query query = entityManager.createNamedQuery("read");
        List<TwitterEntity> resultList = (List<TwitterEntity>) query.getResultList();

        Query quer1 = entityManager.createNamedQuery("readALL");
        List<TwitterEntity> resultList1 = (List<TwitterEntity>) quer1.getResultList();


        Query twitter = entityManager.createNamedQuery("twitter");
        List resultList2 = twitter.getResultList();
        System.out.println(resultList2);

        System.out.println(resultList);
        System.out.println(resultList1);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
