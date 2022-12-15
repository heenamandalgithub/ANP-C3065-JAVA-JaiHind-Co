package lab1_Classes;

import java.util.Scanner;

public class checkNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
boolean increasingNumber=false;
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number:");
num=sc.nextInt();

int currentDigit=num%10;
num=num/10;

while(num>0) {
	if(currentDigit<=num%10) {
		increasingNumber=true;
		break;
	}
	currentDigit=num%10;
	num=num/10;
}
if(increasingNumber) {
	System.out.println("Digits are not in increasing order");
}
else
{
	System.out.println("Digit are in increasing order");
}

	}

}
