package com.mystore.model;

public class Product {
int productId;
String productName;
double productPrice;
public Product() {
	
}

 public Product(int pId,String pName, double pPrice) {
	productId=pId;
	productName=pName;
	productPrice=pPrice;
	
}
 public static void main(String[] args) {
	 
 }
 public Product(int pId) {
	 productId=pId;
	 
 }
 public Product(String pName) {
	 productName=pName;
	 
 }
 public Product(double pPrice) {
	 productPrice=pPrice;
	 
 }
public void setProductId(int pId) {
	productId=pId;
	
}
public int getProductId() {
	return productId;
	
}
public void setProductName(String pName) {
	productName=pName;
	
}

public String getProductName() {
	return productName;
	
}

public void setProductPrice(double pPrice) {
	productPrice=pPrice;
	
}
public double getProductPrice() {
	return productPrice;
	
}
}
