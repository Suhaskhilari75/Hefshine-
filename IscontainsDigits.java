package StringDatatype;

public class IscontainsDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "123654";
		int c = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
				c++;
			}
		}
		if (c == string.length()) {
			System.out.println(string + " contains only digits");
		} else {
			System.out.println(string + " not contains only digits");
		}
		

	}

}
