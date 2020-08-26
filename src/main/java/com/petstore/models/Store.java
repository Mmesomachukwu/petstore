package com.petstore.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String storeNme;

    @Column(nullable = false)
    private Integer storeNumber;
    private String address;
    private String city;
    private String state;
    private String country;

//    @OneToMany
//    @ManyToOne(name = "store_pets")
//    List<Pet> pets;

}
