package com.petstore.repository.dao.store;

import com.petstore.model.model.pet.Pet;
import com.petstore.model.model.store.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StoreRepository extends JpaRepository<Store,Integer> {
    Optional<Store> findBy(Integer storeNumber);
    List<Store> findAll();

}
