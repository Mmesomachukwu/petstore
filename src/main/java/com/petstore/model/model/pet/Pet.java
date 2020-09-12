package com.petstore.model.model.pet;

import com.petstore.model.dto.PetDTO;
import com.petstore.model.model.store.Store;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer petId;

    @Column(nullable = false)
    private String petName;

    @Column(nullable= false)
    private PetTypes type;
    @Column(nullable= false)
    private PetColor color;
    private PetSex gender;
    private Integer age;
    private Integer birthDate;
    private String breed;

    @ManyToOne()
    @JoinColumn(name = "store_pets")
    private Store petStore;

    public Pet(PetDTO petDto){
        this.petId = petDto.getPetId();
        this.petName = petDto.getPetName();
        this.type = petDto.getType();
        this.color = petDto.getColor();
        this.age = petDto.getAge();
        this.gender = petDto.getGender();
    }



}
