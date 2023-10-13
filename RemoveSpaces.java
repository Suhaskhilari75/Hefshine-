package StringDatatype;

public class RemoveSpaces {
// remove spaces from string 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="hef shine 123 sft pvt limited";
		String s="";
		for (int i = 0; i < string.length(); i++) {
			char ch =string.charAt(i);
			if(ch!=' ') {
				s=s+ch;
			}
			
		}
		System.out.println(s);
		char ch ='a';
		int num=ch;
		
		System.out.println(num);
		

	}

}
