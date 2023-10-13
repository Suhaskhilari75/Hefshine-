package hefshineVariation;


public class Test {

	public static void main(String[] args) {
	
		int a=31;
		int b=40;
		mycode(a,b);
	}

	private static void mycode(int a, int b) {
		int c=b-a;
		b=c%a;
		b=b/a;
		a=++c;
		b=(a- --b)*c;
		System.out.println(a+" "+b+" "+c);
		
	}

}
