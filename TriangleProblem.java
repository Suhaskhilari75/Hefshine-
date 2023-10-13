package hefshineVariation;
//find the number of triangle in with nth step;
//divide into 4 equal parts ;color central part ;divide again uncolored parts into 4 equal parts;
// input 1 =5;
//input 2=17;
public class TriangleProblem {
//oT =original triangle ;div =divisible triangle ;
	public static void main(String[] args) {
		int oT=1;
		int div=1;
		
		
		for (int i = 0; i <=5; i++) {
			 div=(div-(div/4))*4;
			 int ans=oT+div;
			 oT=ans;
			 System.out.println(ans);
		}
		

	}

}
