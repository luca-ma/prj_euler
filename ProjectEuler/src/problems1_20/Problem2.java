package problems1_20;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class Problem2 {
	
	private int previous = 0;
	private static  int current = 1;
	private static int sum =0;

	private int next() {
		int temp = previous + current;
		previous = current;
		current = temp;
		return current;
	}
	public final static int MAX_FIBONACCI_NUM = 4000000;

	
	public static void main(String[] args) {
		
		Instant start = Instant.now();
		Problem2 instance = new Problem2();
		while(current<MAX_FIBONACCI_NUM) {
			if (current%2 ==0) {
				sum+= current;
			}
			instance.next();
		}
	
				
		System.out.println("sum is:"+sum);
		System.out.println("exec in :"+Duration.between(start, Instant.now()));
		

	}

}
