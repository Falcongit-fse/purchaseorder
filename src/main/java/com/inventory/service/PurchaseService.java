package com.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.inventory.entity.Purchase;
import com.inventory.repository.PurchaseRepository;

@Service
public class PurchaseService {
	@Autowired
	PurchaseRepository repository;
	public List<Purchase> getAllPurchases(){
	List<Purchase> purchaseList=(List<Purchase>) repository.findAll();
	return purchaseList;
	}
	public ResponseEntity<String> createPurchase(Purchase purchase){
		repository.save(purchase);
		return new ResponseEntity<String>("Purchase order placed successfully!!", HttpStatus.CREATED);
	}
	public ResponseEntity<String> updatePurchase(Purchase purchase){
		repository.save(purchase);
		return new ResponseEntity<String>("Purchase order updated successfully!!", HttpStatus.OK);
		
	}
	public ResponseEntity<String> deletePurchase(Integer purchaseId){
		repository.deleteById(purchaseId);
		return new ResponseEntity<String>("Purchase order deleted successfully!!", HttpStatus.OK);
		
	}
	public Purchase getPurchaseById(Integer purchaseId){
		Purchase purchase=repository.findById(purchaseId).get();
		return purchase;
		
	}
}
