package com.dlminds.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@lombok
public class Product {

    @Id
    private int id;
    private String productName;
    private String productprice;
    private int quantity;

}
