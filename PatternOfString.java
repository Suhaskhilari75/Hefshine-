package StringDatatype;

public class PatternOfString {
/* pattern of string
hello
hell
hel
he
h
*/
static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "hello";
		for (int i = string.length(); i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(string.charAt(j));
			}
			System.out.println();
		}

	}

}
