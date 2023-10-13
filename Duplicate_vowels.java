package StringVariation;

public class Duplicate_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeks";

		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'U' || ch == 'u') {
				s2 = s2 + ch + ch;

			} else {
				s2 += ch;
			}
		}
		System.out.println(s2);
	}

}
