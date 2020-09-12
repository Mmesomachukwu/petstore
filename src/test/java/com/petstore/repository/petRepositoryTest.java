package com.petstore.repository;

import com.petstore.models.pet.Pet;
import com.petstore.models.pet.PetColor;
import com.petstore.models.pet.PetTypes;
import com.petstore.repository.pet.PetRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.awt.*;
import java.util.Date;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
//@Sql(scripts = {"classpath:db\\insert-pet.sql"} , executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD )
//@Table(catalog = "PetRepositoryTest")
class petRepositoryTest {
    Logger log= Logger.getLogger(getClass().getName());

    @Autowired
    PetRepository petRepository;
    //Pet testPetData;


    @BeforeEach
    void set() {
//        testPetData = petRepository.findById(200).orElse(null);
//        assertThat(testPetData).isNotNull();
//        log.info("Test pet data retrieved from database --> "+ testPetData);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createPetObject(){
        //Pet pet = new Pet();
        Pet pet = new Pet();
        pet.setId(200);
        pet.setPetName("Philemon");
        pet.setPetColor(PetColor.BLACK);
        pet.setAge(42);
        pet.setType(PetTypes.MONKEY);


        log.info("Created pet object"+pet);
        assertThat(pet.getId()).isNull(); //this means that the object have been created but it has not been saved to the database; after it is saved to database an Id will be generated.
        pet = petRepository.save(pet);
        log.info("Saved pet Object" +pet);
        assertThat(pet.getId()).isNotNull();
    }

//    @Test
//    void savePetObject(){
//        Pet pet = new Pet();
//        //pet.setId(200);
//        pet.setPetName("Philemon");
//        pet.setPetColor(PetColor.BLACK);
//        pet.setAge(42);
//        pet.setType(PetTypes.MONKEY);
//        pet = petRepository.save(pet);
//        log.info("Saved pet Object" +pet);
//        assertThat(pet.getId()).isNotNull();
//
//    }

}
