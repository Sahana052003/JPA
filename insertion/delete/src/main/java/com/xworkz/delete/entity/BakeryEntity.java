package com.xworkz.delete.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bakery_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BakeryEntity {
    @Id
    private int id;
    private String itemName;
    @Column(name="amount")
    private Double cost;
    private String flavor;
}
