package StringDatatype;

public class ReplaceCharWithAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Heyy i am robot"
				+ "";
		char c1 = 'e';
		char c2 = '*';
		String string2 ="";
		for (int i = 0; i <string.length(); i++) {
			if (string.charAt(i) == c1) {
				string2 += c2;
			} else {
				string2 += string.charAt(i);
			}
		}
		System.out.println(string2);

	}

}
