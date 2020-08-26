package com.petstore.repository;

import com.petstore.models.Pet;
import com.petstore.models.PetColor;
import com.petstore.models.PetTypes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Table;
import java.util.Date;
import java.util.Optional;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@Table(catalog = "PetRepositoryTest")
class petRepositoryTest {
    Logger log= Logger.getLogger(getClass().getName());

    @Autowired
    PetRepository petRepository;


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
//    @Test
//    void createPetObject_thenSaveToDatabase(){
//        Pet pet = new Pet();
//        pet.setAge(42);
//        //Object petTypes;
//        pet.setType(PetTypes.MONKEY);
//        pet.setBirthDate(new Date());
//        pet.setPetColor(PetColor.BLACK);
//        log.info("Created pet object"+pet);
//        assertThat(pet.getId()).isNull();
//        pet = petRepository.save(pet);
//        log.info("After saving per Object"+pet);
//        assertThat(pet.getId()).isNotNull();
//    }

    @Test
    void createPetObject(){
        Pet pet = new Pet();
        pet.setPetName("Philemon");
        pet.setPetColor(PetColor.BLACK);
        pet.setAge(42);
        pet.setType(PetTypes.MONKEY);

        log.info("Created pet object"+pet);
        assertThat(pet.);
        //assertThat(pet.getId()).isNull();
    }
//    @Te
//    void savePetObject(){
//      Optional<Pet> savedPet = petRepository.save(createPetObject());
//    }
}
