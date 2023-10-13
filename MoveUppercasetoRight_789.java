package StringVariation;

public class MoveUppercasetoRight_789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Geeksforgeeks A Computer Science Portal for Geeks!!";
		String uppercaseString = "";
		String lowercaseString = "";

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch <= 'Z' && ch >= 'A') {
				uppercaseString += ch;
			} else {
				lowercaseString += ch;
			}

		}
		System.out.println(lowercaseString+uppercaseString);
	}

}
