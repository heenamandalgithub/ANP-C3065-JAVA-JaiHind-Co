package Lab4_Operators;
import java.util.Scanner;

public class Sumofcube { 
	int cube=0;
	
	public int calculateCube(int n) {
		
	while(n>0) {
	int a=n%10;
			
	cube=cube+(a*a*a);
			
	n=n/10;
				
	}
		
	System.out.println("The Sum Of Cubes Of Entered Number Is : ");
		
		return cube;
	}
	

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Number : ");
		
		int n=sc.nextInt();
		
		Sumofcube s=new Sumofcube();
		
		System.out.println(s.calculateCube(n));

}
}

