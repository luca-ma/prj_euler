package problems1_20;

import java.time.Duration;
import java.time.Instant;
import static util.Util.*;
/**
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * @author luca
 *
 */
public class Problem4 {

	public static void main(String[] args) {

		long num =0;
		long largestPali =0;
		Instant start = Instant.now();
		for(int i=0; i<1000;i++) {
			for(int j=0; j<1000;j++) {
				
					num=i*j;
					if(isPalindrome(num)&&num>largestPali) {
						largestPali = num;
					
				}
			}
		}
		
		
		
		System.out.println("largest palindrome:"+largestPali);
		System.out.println("exec in :"+Duration.between(start, Instant.now()));

	}

}
