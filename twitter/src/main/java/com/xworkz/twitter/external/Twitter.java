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
        query.setParameter("name","Bindhu");
        List<TwitterEntity> resultList = (List<TwitterEntity>) query.getResultList();
        System.out.println("query----");
        System.out.println(resultList);

        Query quer1 = entityManager.createNamedQuery("readALL");
        quer1.setParameter("username","Muktha");
        List<TwitterEntity> resultList1 = (List<TwitterEntity>) quer1.getResultList();
        System.out.println("quer1===");
        System.out.println(resultList1);

        Query twitter = entityManager.createNamedQuery("twitter");
        List resultList2 = twitter.getResultList();
        System.out.println(resultList2);
        System.out.println("twitter--");

        Query data = entityManager.createNamedQuery("data");
        data.setParameter("mobile_number",7823198473L);
        data.setParameter("email_id","bindu7@gmail.com");
        System.out.println("data=====");
        List res=data.getResultList();
        System.out.println(res);

        System.out.println("AND=====");
        Query chat = entityManager.createNamedQuery("chat");
        chat.setParameter("phoneNumber",8923561848L);
        chat.setParameter("name","Nandushree");
        List resultList3 = chat.getResultList();
        System.out.println(resultList3);


        System.out.println("OR Operator");
        Query vi = entityManager.createNamedQuery("vi");
        vi.setParameter("mobile_Number",7823198473L);
        vi.setParameter("email_Id","bindu7@gmail.com");
        List resultList4 = vi.getResultList();
        System.out.println(resultList4);


        System.out.println("---OR -- Operator");
        Query contact = entityManager.createNamedQuery("contact");
        contact.setParameter("email","nandu3@gmail.com");
        contact.setParameter("phoneNumber",8923561848L);
        List resultList6 = contact.getResultList();
        System.out.println(resultList6);


        System.out.println("Named Native Query=====OR=====");
        Query check = entityManager.createNamedQuery("check");
        check.setParameter("user","Nandushree");
        check.setParameter("email_id","nandu3@gmail.com");
        List resultList5 = chat.getResultList();
        System.out.println(resultList5);


        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
