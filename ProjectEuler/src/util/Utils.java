package util;

import java.math.BigInteger;

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
	
	public static long fibonacci(long num) {
		if (num ==0) {
			return 1;
		}
		return num * fibonacci(num-1);
	}
	
	public static BigInteger fibonacci(BigInteger num) {
		if (num.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		}
		BigInteger newNum = num.subtract(BigInteger.ONE);
		return num.multiply(fibonacci(newNum));
	}
}
