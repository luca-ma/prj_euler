package problems1_20;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.TreeSet;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/


public class Problem3 {

	private static BigInteger NUM = new BigInteger("600851475143");
	public static void main(String[] args) {
		Instant start = Instant.now();
		
		System.out.println("fattore primo più alto:"+primeFactors(NUM).last());
		System.out.println("exec in :"+Duration.between(start, Instant.now()));
		
	}
	


	public static TreeSet<BigInteger> primeFactors (BigInteger number) {
		   BigInteger n = number;
	        TreeSet<BigInteger> factors = new TreeSet<>();
	        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(n) <= 0;i=i.add(BigInteger.ONE)) {
	            while (n.remainder(i).intValue()==0) {
	                factors.add(i);
	                n = n.divide(i);
	            }
	        }
	        return factors;
	    }

}
