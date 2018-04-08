package util;

import java.time.Duration;
import java.time.Instant;

public interface GenericProblem {

	public int execProb();
	
	public default void exec() {
		Instant start = Instant.now();
		
		System.out.println("risultato:"+execProb());
		System.out.println("exec in :"+Duration.between(start, Instant.now()));
	}
	
}
