package com.petstore.repository;

import com.petstore.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface storeRepository extends JpaRepository<Store,Integer> {

}
