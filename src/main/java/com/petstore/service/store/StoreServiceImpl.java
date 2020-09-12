package com.petstore.service.store;

import com.petstore.model.model.store.Store;
import com.petstore.repository.dao.store.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StoreServiceImpl implements StoreService{

    @Autowired
    StoreRepository storeRepository;

    @Override
    public Optional<Store> findByStoreNumber(Integer storeNumber){return storeRepository.findBy(storeNumber);}

    @Override
    public List<Store> findAllByStoreNumber(){return storeRepository.findAll();}
}
