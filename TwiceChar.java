package StringDatatype;

public class TwiceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";

		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			//char ch=s1.charAt(i); 
			s2 = s2 + s1.charAt(i)+s1.charAt(i);
		}
		System.out.println(s2);
		System.out.println();

	}

}
