package firstjava;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter age:");
		int a =sc.nextInt();
		System.out.println(a);
		if(a>18)
		{
			System.out.print("eligible for driving licence");
		}
		else
		{
			System.out.print("Not eligible for driving licence");
		}
	}
}
