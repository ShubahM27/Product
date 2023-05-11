package com.careercamp.dto;

public class ProductDTO {
	private int prodID;
	private String prodName;
	private double price;
	private int quantity;
	private double discount;
	
	public ProductDTO(int prodID,String prodName,double price,int quantity,double discount) {
		this.prodID=prodID;
		this.prodName=prodName;
		this.price=price;
		this.quantity=quantity;
		this.discount=discount;
	}
	
	public int getProdId() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID=prodID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName=prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount=discount;
	}
	
	
}
