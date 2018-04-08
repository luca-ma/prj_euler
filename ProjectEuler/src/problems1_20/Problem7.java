package problems1_20;

import util.GenericProblem;
import util.Utils;
/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */

public class Problem7 implements GenericProblem {

	private static final int NUM_PRIMES =10001;
	@Override
	public int execProb() {
		int i =2;
		int numPrim= 0;
		boolean notFound = true;
		while (notFound) {
			if(Utils.isPrime(i)){
				numPrim++;
			}
			if(numPrim==NUM_PRIMES) {
				break;
			}
			i++;
		}
		return i;
	}

	
	public static void main(String[] args) {
		new Problem7().exec();
				

	}
}
