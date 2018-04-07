package problems1_20;

import java.time.Duration;
import java.time.Instant;
/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Project4 {

	
	
	public static void main(String[] args) {
		
		int max =0;

Instant start = Instant.now();
		
		for (int num1 =100; num1<1000;num1++) {
			for (int num2 =100; num2<1000;num2++) {
				int prod = num1*num2;
				String prodStr = String.valueOf(prod);
				String reversedProd =new StringBuilder(prodStr).reverse().toString();

				if((reversedProd.equals(prodStr))&&(prod > max)) {
					
					max = prod;
					System.out.println("palidromo intermedio:"+max);
				}
			}
		}
		
		System.out.println("palidromo prod più alto:"+max);
		System.out.println("exec in :"+Duration.between(start, Instant.now()));
	}

}
