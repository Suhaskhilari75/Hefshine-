package StringDatatype;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "abcde";
		char ch = 'c';
		String string2 = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ch) {
				string2 += string.charAt(i);
			}
		}
		System.out.println(string2);
	}

}
