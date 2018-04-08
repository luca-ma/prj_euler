package problems1_20;

import util.GenericProblem;
/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
import util.Utils;

public class Problem10 implements GenericProblem {

	
	private final static int MAX = 2000000;
	@Override
	public Number execProb() {
		long sum=0;
		int num= 2;
		while (num < MAX) {
			if(Utils.isPrime(num)){
				sum+=num;
				System.out.println("prime:"+num);
			}
			num++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		new Problem10().exec();
				

	}

}
