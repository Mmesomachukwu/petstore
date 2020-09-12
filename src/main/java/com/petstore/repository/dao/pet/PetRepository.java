package com.petstore.repository.dao.pet;

import com.petstore.model.model.pet.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PetRepository extends JpaRepository<Pet,Integer> {
    Optional<Pet> findBy(String petName);
    List<Pet> findAll();
}
