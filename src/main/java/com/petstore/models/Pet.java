package com.petstore.models;


import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
public class Pet {
    @Id
    @GeneratedValue
    private Integer Id;

    @Column(nullable = false)
    private String petName;

    private String breed;
    @Column(nullable = false)
    private PetColor petColor;

    @Column(name = "type", nullable = false) //can stand for mapping the column name of the
    @Enumerated(EnumType.STRING)
    private PetTypes type;

    private PetSex gender;
    private Date birthDate;

    @Nullable
    private Integer age;





}