package StringDatatype;

public class SortString {
//sorting String 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "9875241";
		String s1 = "";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		s1=new String(ch);
		System.out.println(s1);

	}

}
