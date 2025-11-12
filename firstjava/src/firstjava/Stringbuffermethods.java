package firstjava;

public class Stringbuffermethods {

	public static void main(String[] args) {

		 //String append//
		StringBuffer s=new StringBuffer("hello");
		s.append("test");
		System.out.println(s);
				
		 //String insert//
		StringBuffer s143=new StringBuffer("hello");
		s143.insert(3, "world");
		System.out.println(s143);
		
		 //String insert//
		StringBuffer s21=new StringBuffer("hello");
		s21.delete(3,4);
		System.out.println(s21);
		
		 //String insert//
		StringBuffer s31=new StringBuffer("hello");
		s31.replace(2, 3, "rep");
		System.out.println(s31);
	}

}
