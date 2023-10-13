package StringVariation;

import java.util.ArrayList;

public class MaxNumFromString {

	public static void main(String[] args) {
// find maximum number from string  
		// here output is ==>564;
		String string = "100sjhfb564wiewb365abc";
		String string2 = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		// list for numbers
		// loop traverse by characters
		for (int i = 0; i < string.length(); i++) {

			char ch = string.charAt(i);// character
			// if present bet number then add to string2
			if (ch <= '9' && ch >= '0') {
				string2 = string2 + ch;

			} else {
				if (string2.length() > 0) {
					list.add(Integer.parseInt(string2));
				}
				string2 = "";

			}
			//

			if (i == string.length() - 1 && string2.length() > 0) {
				list.add(Integer.parseInt(string2));
			}

		}

		System.out.println(list);

		int max = Integer.MIN_VALUE;
		for (Integer integer : list) {
			if (max < integer) {
				max = integer;
			}
		}
		System.out.println("maximum number from string is : " + max);

	}

}
