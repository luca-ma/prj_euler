package util;

public class Utils {

	
	public static boolean isPrime (int num) {
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPerfectSquare(int num) {
		double sqrt = Math.sqrt(num);
		int x = (int) sqrt;
		return (Math.pow(sqrt,2) == Math.pow(x,2));
	}
	
}
