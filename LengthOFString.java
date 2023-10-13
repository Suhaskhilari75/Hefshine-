package StringDatatype;

public class LengthOFString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Welcome";
		int index = 8;
		char ch[] = string.toCharArray();
		if (index > ch.length) {
			System.out.println("out of range");
		} else {
			System.out.println(ch[index]);
		}
	}

}
