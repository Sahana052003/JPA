package com.xworkz.student.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="student_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor

@NamedQuery(name = "findByName",
        query = "select nq from StudentEntity nq where nq.name =:nameby ")


@NamedQuery(name = "FindBYPhoneNumber",
query = "select nq from StudentEntity nq where nq.phoneNumber= :phoneNumberby")


@NamedQuery(name="FindByEmaill"
        ,query = "select s from StudentEntity s where s.email=:emailby ")


public class StudentEntity {
    @Id
    private int id;
    private String name;
    private String email;
    private long phoneNumber;
    private int age;
}
