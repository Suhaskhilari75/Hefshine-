package StringDatatype;

public class Removecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "computer";
		String s2 = "cat";
		String s3 = "";
		for (int i = 0; i < s1.length(); i++) {
			int count = 0;
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					count++;
				}
			}
			if (count == 0) {
				s3 = s3 + s1.charAt(i);
			}
		}
		System.out.println(s3);

	}
}
