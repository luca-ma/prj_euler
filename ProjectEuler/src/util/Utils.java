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
}