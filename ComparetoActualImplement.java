package StringDatatype;

public class ComparetoActualImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcd";
		String s2 = "abcde";
		int i = 0;
		int cnt = 0;
		// for different string and same length
		while (i < s1.length() && i < s2.length()) {
			if (s1.charAt(i) == s2.charAt(i)) {
				cnt++;

			} else {
				System.out.println(s1.charAt(i) - s2.charAt(i));
				break;
			}
			i++;

		}
		// for same string till one string ends up but different length
		if (cnt == s1.length() || cnt == s2.length()) {
			System.out.println(s1.length() - s2.length());
			// return length difference

		}

	}

}
