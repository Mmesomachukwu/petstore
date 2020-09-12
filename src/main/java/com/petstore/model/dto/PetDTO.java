package com.petstore.model.dto;

import com.petstore.model.model.pet.PetColor;
import com.petstore.model.model.pet.PetSex;
import com.petstore.model.model.pet.PetTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetDTO {
    private Integer petId;
    private String petName;
    private PetTypes type;
    private PetColor color;
    private Integer age;
    private PetSex gender;

}
