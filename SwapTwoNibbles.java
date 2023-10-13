package StringDatatype;

public class SwapTwoNibbles {

	public static void main(String[] args) {

		int n=100;
		String string=Integer.toBinaryString(n);
		System.out.println(string);
		while(string.length()<8) {
			string='0'+string;
			System.out.println("after adding string : "+string);
		}
		    
		String part1=string.substring(0,4);
		String part2=string.substring(4);
		//System.out.println(part1);
		string=part2+part1;
		//System.out.println(string);
		int num=Integer.parseInt(string,2);
		//System.out.println(num);
		
		
	}

}
