package firstjava;

public class Stringbuildermethods {

	public static void main(String[] args) {

		 //String append//
		StringBuilder s=new StringBuilder("hello");
		s.append("test");
		System.out.println(s);
				
		 //String insert//
		StringBuilder s143=new StringBuilder("hello");
		s143.insert(3, "world");
		System.out.println(s143);
		
		 //String insert//
		StringBuilder s21=new StringBuilder("hello");
		s21.delete(3,4);
		System.out.println(s21);
		
		 //String insert//
		StringBuilder s31=new StringBuilder("hello");
		s31.replace(2, 3, "rep");
		System.out.println(s31);
	}

}
