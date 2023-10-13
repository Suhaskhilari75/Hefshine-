package StringDatatype;

public class OddStringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="hefshine";
		String oddstring="";
		for (int i = 0; i < string.length(); i+=2) {
			char ch =string.charAt(i);
			oddstring=oddstring+ch;
		}
		System.out.println(oddstring);
		


	}

}
