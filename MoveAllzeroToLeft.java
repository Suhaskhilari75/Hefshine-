package StringDatatype;

public class MoveAllzeroToLeft {
// shift zeroes to left and nonzero to right
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "0003001230569";
		String s = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == '0') {
				s = ch + s;
			} else {
				s = s + ch;
			}
		}
		System.out.println(s);

	}

}
