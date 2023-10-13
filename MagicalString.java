package StringDatatype;

public class MagicalString {
	// for lowercase 219
	// for UPPERCASE 155
	/*
	 * Magical String[Duplicate Problem]
	 * 
	 * You are given a string S, convert it into a magical string. A string can be
	 * made into a magical string if the alphabets are swapped in the given manner:
	 * a->z or z->a, b->y or y->b, and so on. Note: All the alphabets in the string
	 * are in lowercase.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String s1 = "varun";
		String s1 = "AbCd";

		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				char ch2 = magicChar(ch);
				s2 = s2 + ch2;
			} else {
				char ch2 = magicChar2(ch);
				s2 = s2 + ch2;
			}

		}
		System.out.println(s2);

	}

	public static char magicChar(char ch) {
		int num = 219 - ch;
		char c = (char) (num);
		return c;

	}

	public static char magicChar2(char ch) {
		int num = 155 - ch;
		char c = (char) (num);
		return c;

	}

}
