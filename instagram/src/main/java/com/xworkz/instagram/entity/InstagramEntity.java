package com.xworkz.instagram.entity;

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


@NamedQuery(name = "findByAgelessthan",
        query = "select nq from InstagramEntity nq WHERE nq.age < 18")

public class InstagramEntity {
    @Id
    private int id;
    private String name;
    private String email;
    private long phoneNumber;
    private int age;
}
