package com.codingz2m.classes_objects.instance.members;

/*
 Class: Fundamental component of object oriented programming in Java.
 Class : Template/Blueprint for an objects...
 Class: User-defined data type...
 And, create separate Java source file for each class declaration...but eclipse will create it for you.
 */

public class Laptop {

	// Member variables / Fields / Instance Variables... state of the Product
	/* Applying Encapsulation (hiding variables or methods), using 
	    'private' variable declarations.....
	    Encapsulation: The internal workings / representations of an object is hidden from outside the 
	    objects definition
	 */
	private String productCode;
	private String productName;
	private double price;
	private boolean promoCode;
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isPromoCode() {
		return promoCode;
	}
	public void setPromoCode(boolean promoCode) {
		this.promoCode = promoCode;
	}
	
	// Creating methods (setter/getter) for updating the model
	
	
}
