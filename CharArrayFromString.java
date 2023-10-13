package StringDatatype;
// ctl shift O => for removing unused packages
public class CharArrayFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Hefshine";
		// cotent of string convert into char array and print with indexes
		char ch[] = new char[string.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = string.charAt(i);
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(i + " :" + ch[i]);
		}
		

	}

}
