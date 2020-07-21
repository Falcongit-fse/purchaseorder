package com.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.inventory.entity.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, Integer>{

}
