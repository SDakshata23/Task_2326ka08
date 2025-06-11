package basic.corejava;

import java.util.Scanner;

public class MarkValidation {

	public static void main(String[] args) {
		String name;
		int rollno,mark1,mark2,mark3,mark4,mark5;
		int total;
		float avg;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your name:");
	    name=in.nextLine();
		System.out.println("Enter your roll no:");
		rollno=in.nextInt();
		System.out.println("Enter marks:");
		mark1=in.nextInt();
		mark2=in.nextInt();
		mark3=in.nextInt();
		mark4=in.nextInt();
		mark5=in.nextInt();
		
		total=mark1+mark2+mark3+mark4+mark5;
		avg=total/5;
		if(avg>=80 && avg<=100) {
			System.out.println("Grade A");
		}
		else if(avg>=60 && avg<=79) {
			System.out.println("Grade B");
		}
		else if(avg>=30 && avg<=59) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("You Failed");
		}
	}

}
