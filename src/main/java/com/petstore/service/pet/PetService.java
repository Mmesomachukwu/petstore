package com.petstore.service.pet;

import com.petstore.model.dto.PetDTO;
import com.petstore.model.model.pet.Pet;

import java.util.List;
import java.util.Optional;

public interface PetService {

    Optional<Pet> findByPetName(String petName);
    List<Pet> findAllByPetName(String petName);
    Pet savePet(Pet pet);
    void createPet(PetDTO petDto) throws Exception;
    void addPetToStore();
//    void update();
//    void delete();
}
