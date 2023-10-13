package StringDatatype;

public class SortByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Welcome to java programming language";
		String wordString[] = string.split(" ");

		for (int i = 0; i < wordString.length; i++) {
			for (int j = i + 1; j < wordString.length; j++) {
				if (wordString[i].length() > wordString[j].length()) {
					String tempString=wordString[i];
					wordString[i]=wordString[j];
					wordString[j]=tempString;
				}
			}
		}
		for (String string2 : wordString) {
			System.out.println(string2);
		}
		System.out.println("*********************");
		System.out.println("smallest word: "+wordString[0]);
		System.out.println("largest word : "+wordString[wordString.length-1]);

	}

}
