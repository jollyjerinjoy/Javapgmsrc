package firstjava;

public class Swappgm {
	//2. Write a program to swap two numbers with temporary variable. Print the numbers before and after swap
	public static void main(String[] args) {
		int a=1;
		int b=2;
		System.out.println("numbers before Swap " + "a:" +a+" " + "b:" + b);
		int c=a;
		a=b;
		b=c;
		System.out.println("numbers after Swap " + "a:" +a+" " + "b:" + b );
//3. Write a program to swap two numbers without temporary variable. Print the numbers before and after swap.
//a=a+b;
//b=a-b;
//a=a-b;
//System.out.println("numbers after Swap " + "a:" +a+" " + "b:" + b );


	}

}
