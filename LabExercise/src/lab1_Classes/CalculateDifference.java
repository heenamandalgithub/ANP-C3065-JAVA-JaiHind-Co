package lab1_Classes;

import java.util.Scanner;

public class CalculateDifference {

	public int calculateDifference(int n) {
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 0; i <= n; i++) {
				sum = sum + (i * i);
			}
		for (int j = 0; j <= n; j++) {
				sum1 = (sum1 + j);
				
			}
		sum2 = sum1 * sum1;
		sum3 = sum2-sum;

		System.out.println("The Difference Between The Square Of First " + n
					+ "  Natural Numbers And The Square Of Their Sum  Is :" + sum3);
		return sum3;
		}

	public static void main(String[] args) {
		System.out.println("Enter The Number:");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		CalculateDifference c = new CalculateDifference();
		c.calculateDifference(n);
		}

	}
