package problems1_20;

import java.math.BigInteger;

import util.GenericProblem;
import util.Utils;

public class Problem20 implements GenericProblem {

	@Override
	public Number execProb() {
		BigInteger fibonacci = Utils.fibonacci(BigInteger.valueOf(100L));
		
		//fibonacci.
		long sum =0;
		
		String strFib = String.valueOf(fibonacci);
		System.out.println(strFib);
		for(int idx =0; idx < strFib.length();idx++) {
			long num = strFib.charAt(idx)-'0';
			sum+=num;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		new Problem20().exec();

	}
}
