package basic.corejava;
import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		float P,R,Time;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the principal amt: ");
		P=in.nextInt();
		System.out.print("Enter the rate: ");
		R=in.nextInt();
		System.out.print("Enter the time period: ");
		Time=in.nextInt();
		float SI=(P*R*Time)/100;
		System.out.println("Simple Interst:"+SI);
		in.close();
	}

}
