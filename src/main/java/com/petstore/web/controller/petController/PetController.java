package com.petstore.web.controller.petController;


import com.petstore.model.dto.PetDTO;
import com.petstore.service.pet.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Pet")
public class PetController {

    @Autowired
    PetService petservice;

    @PostMapping("/createPet")
    public String createPet(PetDTO petDto){

        petservice.createPet(petDto);
        return "Pet  is created";
    }
}
