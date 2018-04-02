package solved.prob1;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
	Find the sum of all the multiples of 3 or 5 below 1000.
 * @author luca
 *
 */
public class Problem1 {

	public final static int MAX_NUM = 1000;
	
	public static void main(String[] args) {
		
		Instant start = Instant.now();
		IntStream naturalNum = IntStream.iterate(0, i -> i + 1);
		
		int sum = naturalNum.limit(MAX_NUM).filter(num ->  (num%3==0 || num%5 ==0)).
	   // forEach(num -> 		System.out.println(num)).
		sum();
		
		System.out.println("sum is:"+sum);
		System.out.println("exec in :"+Duration.between(start, Instant.now()));
		
	}

}
