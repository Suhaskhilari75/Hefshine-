package hefshineVariation;
//1 ,3,6,10,15.......diffference increse by 1 from 2 to so on ..
public class Series_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int m=5;
		
		int sum=0;
		int diff=2;
		int count=0;
		while(count<m) {
			sum+=n;
			n=n+diff;
			diff++;
			count++;
		}
		System.out.println("sum of series is "+sum);

	}

}
