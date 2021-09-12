package problems1_20;

import java.time.Duration;
import java.time.Instant;
/**
 * The sum of the squares of the first ten natural numbers is,
 * The square of the sum of the first ten natural numbers is,
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * @author luca
 *
 */
public class Problem6 {

	public static void main(String[] args) {

		
		int MAX_NUM =100;
		long sum= 0;
		long sumOfSquares =0;
		long squareOfsum= 0;

		Instant start = Instant.now();

		for(int i=1; i<=MAX_NUM;i++) {

			sum+=i;
			sumOfSquares+=i*i;
		}



		squareOfsum= sum*sum;
		System.out.println("sum:"+sum);
		System.out.println("sumOfSquares:"+sumOfSquares);
		System.out.println("squareOfsum:"+squareOfsum);
		System.out.println("diff:"+(squareOfsum-sumOfSquares));
		System.out.println("exec in :"+Duration.between(start, Instant.now()));

			
		}
		
	

}
