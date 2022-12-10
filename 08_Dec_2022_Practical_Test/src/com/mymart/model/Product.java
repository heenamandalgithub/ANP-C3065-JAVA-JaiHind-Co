package com.mymart.model;

	import java.util.Objects;
	public class Product {
		private int productId;
		private String productName;
		private double productPrice;
		
		Product(int id,String name,double price){
			super();
			this.productId =id;
			this.productName = name;
			this.productPrice=price;	
		}
		
		 public void setId(int productId) {
		        this.productId = productId;
		    }
	    public void setName(String productName) {
	        this.productName = productName;
	    }
	    
	    public void setPrice(float productPrice) {
	        this.productPrice = productPrice;
	    }
	    
	    public int getId() {
	   	 return productId;  
	   }
	 
	    public String getName() {
	    	 return productName;
	    }
	    
	  
	    public double getPrice() {
	        return productPrice;
	    }
	    
	    @Override
	    public String toString() {
	        return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
	    }
	    
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (this == null)    
			return false;
			return false;
			

	   
	    }
	    @Override
	    public int hashCode() {
	        return Objects.hash(productId, productName,productPrice);
	    }
	
}
