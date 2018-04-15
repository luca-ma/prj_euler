package util;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.rmi.CORBA.Util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UtilFilesTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReadFileLines() {
		try {
			UtilFiles.readFileLines("prob11.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
