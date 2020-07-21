package com.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entity.Purchase;
import com.inventory.service.PurchaseService;

@RestController
public class PurchaseController {
	@Autowired
	PurchaseService service;
	@GetMapping("/ims/getAllPurchases")
	public List<Purchase> getAllPurchases(){
		List<Purchase> purchaseList=service.getAllPurchases();
		return purchaseList;
	}
	@PostMapping("/ims/createPurchase")
	public ResponseEntity<String> createPurchase(@RequestBody Purchase purchase){
		return service.createPurchase(purchase);		
		
	}
	@PutMapping("/ims/updatePurchase")
	public ResponseEntity<String> updatePurchase(@RequestBody Purchase purchase){
		return service.updatePurchase(purchase);		
		
	}
	@DeleteMapping("/ims/deletePurchase/{purchaseId}")
	public ResponseEntity<String> deletePurchase(@PathVariable Integer purchaseId){
		return service.deletePurchase(purchaseId);		
		
	}
	@GetMapping("/ims/getPurchaseById/{purchaseId}")
	public Purchase getPurchaseById(@PathVariable Integer purchaseId) {
		return service.getPurchaseById(purchaseId);
	}
}









