package tasks;

import java.util.Scanner;

public class DivisiblebyZero {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number 1 and number 2:");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int y;
		
		
		try {
			y = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		
		y = num1 / num2;
		System.out.println("Result:" + y);

		in.close();
	}
}
