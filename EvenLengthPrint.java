package StringDatatype;

public class EvenLengthPrint {
// print even length words only in from a string 
	public static void main(String[] args) {
		String string = "This is a java Language";

		String s[] = string.split(" ");// split and store in array
		for (int i = 0; i < s.length; i++) {
			String s1 = s[i];
			if (s1.length() % 2 == 0) {
				System.out.println(s1);
			}
		}

	}

}
