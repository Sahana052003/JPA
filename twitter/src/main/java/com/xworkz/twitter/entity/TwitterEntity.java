package com.xworkz.twitter.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NamedNativeQuery;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="twitter_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedNativeQuery(name = "readALL",query = "select * from twitter_tb",resultClass = TwitterEntity.class)
@NamedQuery(name="read",query = "select entities from TwitterEntity entities")

@NamedQuery(name="twitter",query = "select n from TwitterEntity n")
public class TwitterEntity {
    @Id
    private String name;
    private String email;
    private long phoneNumber;
}
