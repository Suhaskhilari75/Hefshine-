package StringVariation_School_level_7;

public class Contains_Only_whitespace {

	public static void main(String[] args) {
		/*
		 * Given a string str, the task is to check if this string contains only
		 * whitespaces or some text, in Java.
		 * 
		 * Examples:
		 * 
		 * Input: str = "              " Output: True
		 * 
		 * Input: str = "GFG" Output: False
		 */

		String string = "      ";
		int c = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch != ' ') {
				System.out.println("false");
				break;
			} else {
				c++;
			}
		}
		if (c == string.length()) {
			System.out.println("contains only whitespaces ");
		}

	}

}
