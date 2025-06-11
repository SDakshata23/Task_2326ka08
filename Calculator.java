package basic.corejava;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		//declaring variables
		int option,num1,num2;
		
		
		do {
			System.out.println("---------CALCULATOR---------");
			System.out.println("Options");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("Enter your choice:");
			option=in.nextInt();
			
			
		//if choice exceeds the option
			if(option>4) {
				System.out.println("Invalid option");
				break;
			}
			
		//Get the input from user
		System.out.println("Enter First number:");
		num1=in.nextInt();
		System.out.println("Enter Second number:");
		num2=in.nextInt();
		
		
		switch(option) {
		case 1:
			add(num1,num2);
			break;
		case 2:
			sub(num1,num2);
			break;
		case 3:
			mul(num1,num2);
			break;
		case 4:
			div(num1,num2);
			break;
		default :
			System.out.println("Invalid option");
		}
		}while(false);
		}
	
	//methods
	public static void add(int num1,int num2) {
		int result=num1+num2;
		System.out.println("Result:"+result);
		}
  
	public static void sub(int num1,int num2) {
		int result=num1-num2;
		System.out.println("Result:"+result);
		}
  
	public static void mul(int num1,int num2) {
		int result=num1*num2;
		System.out.println("Result:"+result);
		}
  
	public static void div(int num1,int num2) {
		int result=num1/num2;
		System.out.println("Result:"+result);
		}
}
 