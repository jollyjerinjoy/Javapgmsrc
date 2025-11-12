package firstjava;

public class Stringprogram {

	public static void main(String[] args) {
		//length//
		String str="jolly";
		System.out.println("str.length jolly");
		System.out.println(str.length());
	//equals//	
		String s1="java";
		String s2="Java";
		String s3="java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
    //equalsIgnoreCase//
		String s11="java";
		String s22="Java";
		String s33="java";

		System.out.println(s11.equalsIgnoreCase(s22));
		System.out.println(s11.equalsIgnoreCase(s33));
		
		 //upperCase//
		String s111="java";
				System.out.println(s111.toUpperCase());
				System.out.println(s111.toLowerCase());
				System.out.println(s111.startsWith("s111"));
				System.out.println(s111.startsWith("ja"));
				System.out.println(s111.startsWith("a"));
				System.out.println(s111.endsWith(s111));
				System.out.println(s111.endsWith("va"));
				System.out.println(s111.endsWith("Va"));
				System.out.println(s111.charAt(2));
				System.out.println(String.valueOf(s111));
				int n=100;
				String s331=String.valueOf(n);
				System.out.println(String.valueOf(s331));

	}

}
