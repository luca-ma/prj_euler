package problems1_20;

import java.time.Duration;
import java.time.Instant;
/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * @author luca
 *
 */
public class Problem5 {

	public static void main(String[] args) {

		
		int MAX_DIV =20;
		int num = MAX_DIV;
		
		Instant start = Instant.now();
		boolean found = false;
		while(!found) {
			found=true;
			for(int i=2; i<=MAX_DIV;i++) {

				if(num%i!=0) {
					found=false;
					break;
					
				}
								
			}
			if (!found) {
				num++;
			}else {
				break;
			}
			
		}
		
		
		System.out.println("num:"+num);
		System.out.println("exec in :"+Duration.between(start, Instant.now()));

	}

}
