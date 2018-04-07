package problems1_20;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem5 {

	
	public static final List<Integer> numsToTest = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
	//Arrays.asList(6,7,8,9,10);
	
	public static void main(String[] args) {

Instant start = Instant.now();
		boolean found = false;
		int num = 20;
		while(!found) {
			found = true;
			for (Integer numToDiv :numsToTest) {
				if(num%numToDiv!=0) {
					found = false;
					break;
				}
			}
			num++;
		}

		System.out.println("num divisibile:"+(--num));
		System.out.println("exec in :"+Duration.between(start, Instant.now()));
	}

}
