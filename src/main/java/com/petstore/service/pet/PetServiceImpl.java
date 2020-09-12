package com.petstore.service.pet;

import com.petstore.model.dto.PetDTO;
import com.petstore.model.dto.StoreDTO;
import com.petstore.model.model.pet.Pet;
import com.petstore.model.model.store.Store;
import com.petstore.repository.dao.pet.PetRepository;
import com.petstore.service.store.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    PetRepository petRepository;

    @Autowired
    StoreService storeService;

    @Override
    public Optional<Pet> findByPetName(String petName) {
        return petRepository.findBy(petName);
    }

    @Override
    public List<Pet> findAllByPetName(String petName) {
        return petRepository.findAll();
    }

    @Override
    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }


    @Override
    public void createPet(PetDTO petDto) throws Exception{
        Optional<Pet> pet = findByPetName(petDto.getPetName());

        if (pet.isEmpty()) {
            Pet newPet = new Pet(petDto);
            savePet(newPet);
        }
        else{
            throw new Exception("Pet does not exist");
        }

    }

    @Override
    public void addPetToStore(PetDTO petDto, StoreDTO storeDto) {

//        if(petDto == null){
//            throw new NullPointerException("Pet is not created");
//        }

        Optional<Pet> pet = findByPetName(petDto.getPetName());
        Optional<Store> store = storeService.findByStoreNumber(storeDto.getStoreNumber());
        if(store.isPresent()){
            Store newStore = store.get();
            if(pet.isPresent()){
                pet .
            }
            newStore.setPets(newStore.getPets());
        }
    }
//
//    @Override
//    public void update() {
//
//    }
//
//    @Override
//    public void delete() {
//
//    }
}


