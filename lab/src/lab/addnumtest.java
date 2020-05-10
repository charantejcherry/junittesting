package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class addnumtest {

	@Test
	public void testSum1() {
		junittesting ab=new junittesting();
		int out=ab.sum1(4, 5);
		assertEquals(9,out);
		
	}

}
