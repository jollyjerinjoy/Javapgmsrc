package firstjava;

import java.util.Scanner;
//1. Write a program to check the given number is positive
public class numcheck {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter number:");
	int a =sc.nextInt();
	System.out.println(a);
	if(a<0)
	{
		System.out.print("negative");
	}
	else
	{
		System.out.print("positive");
	}
	}

}
