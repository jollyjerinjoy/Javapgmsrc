
package firstjava;

public class Swap2 {
	
		public static void main(String[] args) 
		{ 
			//2. Write a program to swap two numbers with temporary variable. Print the numbers before and after swap 
		int a=1; int b=2; int a1=1; int b1=2; 
		System.out.println("numbers before Swap " + "a:" +a+" " + "b:" + b);
		int c=a; a=b; b=c; 
		System.out.println("numbers after Swap " + "a:" +a+" " + "b:" + b ); 
		
		//3. Write a program to swap two numbers without temporary variable. Print the numbers before and after swap. 
		System.out.println("numbers before Swap " + "a1:" +a1+" " + "b1:" + b1); 
		a1=a1+b1; 
		b1=a1-b1; 
		a1=a1-b1; 
		System.out.println("numbers after Swap " + "a1:" +a1+" " + "b1:" + b1 ); 
		}
	

}
