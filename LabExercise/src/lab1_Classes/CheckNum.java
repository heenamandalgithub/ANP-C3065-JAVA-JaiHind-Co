package lab1_Classes;

import java.util.Scanner;

public class CheckNum {
		public static boolean CheckNum(int number) {
			boolean power=false;
			if(number>0) {
				while(number%2==0) {
					number=number/2;
				}
				if(number==1) {
					power=true;
				}
				else {
					power=false;
				}
			}
			else {
				System.out.println("Enter valid positive number");
			}
			return power;
			}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();

		boolean powerof2=CheckNum(number);
		System.out.println(powerof2);
	}

}
