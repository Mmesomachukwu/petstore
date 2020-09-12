package com.petstore.service.store;

import com.petstore.model.model.store.Store;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StoreService {

    Optional<Store> findByStoreNumber(Integer storeNumber);
    List<Store> findAllByStoreNumber();
}
