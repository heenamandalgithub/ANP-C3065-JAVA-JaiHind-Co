package demo.view;

	import java.util.Scanner;

	import demo.model.Product;
	import demo.service.ProductService;

	public class ProductView {

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			ProductService productService=new ProductService();
			for(int i=0;i<3;i++) {
				System.out.println("Enter product id");
				int pid=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter product name");
				String pname=scanner.nextLine();
				System.out.println("Enter product price");
				double price=scanner.nextDouble();
				Product product=new Product(pid,pname,price);
				productService.setProduct(product);
				
			}
			Product productAr[]=productService.getProducts();
			for(Product product:productAr) {
				System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice());
			}

		}

	}

