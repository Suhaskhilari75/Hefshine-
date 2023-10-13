package StringDatatype;

/*Given two strings S1 and S2 as input. Your task is to concatenate two strings and then reverse the string. Finally print the reversed string.
*/
public class ConcateReverse {

	public static void main(String[] args) {
		String s1 = "geeks";
		String s2 = "forgeeks";
		String s3 = s1 + s2;
		String s4 = "";
		for (int i = 0; i < s3.length(); i++) {
			char ch = s3.charAt(i);
			s4 = ch + s4;

		}
		System.out.println(s4);
		

	}

}
