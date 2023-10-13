package StringDatatype;

public class LowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "WElcome";
		String string2 = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
				char ch = (char) (string.charAt(i) - 32);
				string2 += ch;
			} else {
				string2 =string2+string.charAt(i);
			}
		}
		System.out.println(string2);

	}

}
