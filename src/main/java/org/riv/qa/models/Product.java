package org.riv.qa.models;

public class Product {
	
	String name;
	double price;
	int quantity;
	String linkToProduct;
	
	
	public String getLinkToProduct() {
		return linkToProduct;
	}
	public void setLinkToProduct(String linkToProduct) {
		this.linkToProduct = linkToProduct;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
