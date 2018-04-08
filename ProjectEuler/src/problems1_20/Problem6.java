package problems1_20;

import util.GenericProblem;
/*
 * The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 implements GenericProblem {

	
	public static final int MAX_NUM =100;
	@Override
	public Integer execProb() {

		int sumSquares =0;
		int squaresSum =0;
		
		for (int i=0;i<= MAX_NUM;i++) {
			sumSquares += (i*i);
			squaresSum+=i;
		}
		squaresSum=squaresSum*squaresSum;
		return (squaresSum-sumSquares);
	}

	public static void main(String[] args) {
		new Problem6().exec();
				

	}

}
