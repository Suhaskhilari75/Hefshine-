package StringDatatype;

public class EqualityOFString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";

		String s2 = new String("abcd");

		// inbuilt method

		System.out.println(s1.equals(s2));//behaves as same
		System.out.println(s1 == s2);//behave as different 

		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		int c = 0;
		if (ch1.length == ch2.length) {
			for (int i = 0; i < ch2.length; i++) {
				if (ch1[i] != ch2[i]) {
					c++;
					System.out.println("not equal");
					break;
				}

			}
			if (c == 0) {
				System.out.println("equal");
			}
		} else {
			System.out.println("not equal");
		}

	}

}
