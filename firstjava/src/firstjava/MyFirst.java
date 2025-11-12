package firstjava;

public class MyFirst {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(2+3);

		int items=50;
		float price= 10.03f;
		float total=items * price;
		char currency='£';
		System.out.println(total+""+currency);
		System.out.println(currency);
		System.out.println(10.03*50 +currency);
		
		int maxscore=20;
		int userscore=10;
		double per=(double) maxscore/userscore *11.1;
		System.out.println(per);
		
		
		
		int myint=9;
		double mydouble=myint; //autocasting int to double
		System.out.println(myint);
		System.out.println(mydouble);
		
		double myd=9.7979;
		int myi= (int) myd;
				System.out.println(myi);
				System.out.println(myd);
	}

}
