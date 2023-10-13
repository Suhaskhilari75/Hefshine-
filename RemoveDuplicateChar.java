package StringDatatype;

public class RemoveDuplicateChar {
//print unique character
	public static void main(String[] args) {
		String string = "aababcdeeff";

		char s[] = string.toCharArray();
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (s[i] == s[j]) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				count++;
			}
		}
		char ch[] = new char[count];
		int index = 0;
		for (int i = 0; i < s.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (s[i] == s[j]) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				ch[index++] = s[i];
			}
		}
		String string2 = "";
		for (int i = 0; i < ch.length; i++) {
			string2 = string2 + ch[i];
		}
		System.out.println(string2);

	}

}
