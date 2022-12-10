package com.mymart.view;

	import java.util.LinkedList;
	import com.mymart.model.Product;
	import com.mymart.service.ProductService;

	public class ProductView {
		private static ProductService productService=new ProductService();
		
		public void addProduct()
			//Scanner obj,write to accept input user,store in local var;
			int pId=1;
			String pName="Dell Laptop";
			double pPrice=75000;
		Product product=new Product(pId,pName,pPrice);
		productService.addProductService(Product);

	}

