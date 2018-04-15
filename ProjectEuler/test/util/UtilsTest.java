package util;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsPerfectSquare() {
		assertTrue(Utils.isPerfectSquare(10));
		assertFalse(Utils.isPerfectSquare(8));
	}
	
	@Test
	public void testFibonacci() {
		System.out.println(Utils.fibonacci(BigInteger.valueOf(100L)));
	}

}
