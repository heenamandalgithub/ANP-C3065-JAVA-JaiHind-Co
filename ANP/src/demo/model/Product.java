package demo.model;

public class Product {
int productId;
String productName;
float productPrice;

Product()
{
	System.out.println("Non parameterized constructor");
	}
Product(int pId,String pName){
	productId=pId;
	productName=pName;
}
	void setProductId(int pId){
		productId=pId;
		System.out.println("productId is:"+productId");
	}
{
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
