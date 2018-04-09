package problems1_20;

import util.GenericProblem;
import util.Utils;

public class Problem9 implements GenericProblem {
/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.(non-Javadoc)
 * @see util.GenericProblem#execProb()
 */
	@Override
	public Number execProb() {
		
		for(int a=2; a <1000;a++) {
			for(int b=2; b <a;b++) {
				int c = a*a+b*b;
				
				if(Utils.isPerfectSquare(c)) {
					double sqrt = Math.sqrt(c);
					int x = (int) sqrt;
					int sum = a+b+x;
					if(sum==1000) {
						
						return(a*b*x);
					}
				}
				
				
			}
		}
			
		return 0;
	}

	public static void main(String[] args) {
		new Problem9().exec();

	}

}
