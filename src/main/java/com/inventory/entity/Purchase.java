package com.inventory.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="purchase_orders")
public class Purchase {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer purchaseId;
	private Integer productId;
	private Integer purchaseQuantity;
	private Double purchasePrice;
	private Timestamp purchaseDate;

	public Purchase() {
		super();
	}

	public Purchase(Integer purchaseId, Integer productId, Integer purchaseQuantity, Double purchasePrice,
			Timestamp purchaseDate) {
		super();
		this.purchaseId = purchaseId;
		this.productId = productId;
		this.purchaseQuantity = purchaseQuantity;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
	}

	public Integer getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getPurchaseQuantity() {
		return purchaseQuantity;
	}

	public void setPurchaseQuantity(Integer purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Timestamp getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Timestamp purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", productId=" + productId + ", purchaseQuantity="
				+ purchaseQuantity + ", purchasePrice=" + purchasePrice + ", purchaseDate=" + purchaseDate + "]";
	}

}
