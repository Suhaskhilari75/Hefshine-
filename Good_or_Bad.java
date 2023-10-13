package StringVariation_School_level_7;

public class Good_or_Bad {
	/*
	 * Good or Bad string
	 * 
	 * In this problem, a String S is composed of lowercase alphabets and wildcard
	 * characters i.e. '?'. Here, '?' can be replaced by any of the lowercase
	 * alphabets. Now you have to classify the given String on the basis of
	 * following rules:
	 * 
	 * If there are more than 3 consonants together or more than 5 vowels together,
	 * the String is considered to be "BAD". A String is considered "GOOD" only if
	 * it is not “BAD”.
	 * 
	 * NOTE: String is considered as "BAD" if the above condition is satisfied even
	 * once. Else it is "GOOD" and the task is to make the string "BAD".
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: S = aeioup?? Output: 1 Explanation: The String doesn't contain more
	 * than 3 consonants or more than 5 vowels together. So, it's a GOOD string.
	 * Example 2:
	 * 
	 * Input: S = bcdaeiou?? Output: 0 Explanation: The String contains the
	 * Substring "aeiou??" which counts as 7 vowels together. So, it's a BAD string.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "aeioup??";
		String string2 = "";

		// String string = "bcdaeiou??";

		boolean r = isgood(string);
		if (r) {
			for (int i = 0; i < string.length(); i++) {

				if (string.charAt(i) == '?') {

				} else {
					string2 = string2 + string.charAt(i);
				}
			}
		} else {
			System.out.println("bad");
		}

	}

	public static boolean isgood(String s) {
		int vowel_count = 0;
		int consonant_count = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel_count++;
				consonant_count = 0;
			} else if (ch == '?') {
				// if we want string should bad
				consonant_count++;
				vowel_count++;

				// if we want string should bad
				/*
				 * consonant_count =0; vowel_count=0;
				 */

			} else {

				consonant_count++;
				vowel_count = 0;
			}
			if (vowel_count > 5) {
				return false;
			}
			if (consonant_count > 3) {
				return false;
			}

		}

		return true;

	}

}
