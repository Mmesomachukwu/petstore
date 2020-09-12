package com.petstore.model.model.store;

import com.petstore.model.dto.StoreDTO;
import com.petstore.model.model.pet.Pet;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer StoreId;

    @Column(nullable = false)
    private String storeName;

    @Column(nullable = false)
    private Integer storeNumber;

    private String address;

    private String city;

    private String state;

    private String country;

    @OneToMany(mappedBy = "petStore", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Pet> pets;

    public Store(StoreDTO storeDto){
        this.storeName = storeDto.getStoreName();
        this.storeNumber = storeDto.getStoreNumber();

    }

}
