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

@NamedQuery(name = "findByphNoandEmail",
        query = "select p from StudentEntity p where p.phoneNumber=:mobileNumber and p.email=:emailby")


@NamedQuery(name = "findByAgeGreater",
        query = "select nq from StudentEntity nq WHERE nq.age > 18")


@NamedQuery(name = "findByAgelessthan",
        query = "select nq from StudentEntity nq WHERE nq.age < 18")



@NamedQuery(name = "getCount",
        query ="select count(nq) from StudentEntity nq")

@NamedQuery(name = "getMaxAge",
        query = "select MAX(nq.age) from StudentEntity nq")

@NamedQuery(name = "getMinAge",
        query = "select MIN(nq.age) from StudentEntity nq")

@NamedQuery(name = "getNameList",
        query = "select nq.name from StudentEntity nq")



public class StudentEntity {
    @Id
    private int id;
    private String name;
    private String email;
    private long phoneNumber;
    private int age;
}
