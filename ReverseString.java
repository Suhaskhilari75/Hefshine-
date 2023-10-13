package StringDatatype;

public class ReverseString {
    // reverse string 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="hefshine";
		String revString="";
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
			revString=c+revString;
		}
		System.out.println(revString);

	}

}
