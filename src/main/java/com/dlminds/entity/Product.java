package com.dlminds.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@lombok
public class Product {

    @Id
    private int id;


}
