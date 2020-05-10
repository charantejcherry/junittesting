package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class addtwostrings {

	@Test
	public void testJoin() {
		junittesting abc=new junittesting();
		String out1=abc.join("hi","hello");
		assertEquals("hihello",out1);
	}

}
