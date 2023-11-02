package junitprograms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionDemo {
	@Test
	public void checkassertionequal() {
		int res=1;
		int exp=1;
		assertEquals(res,exp);

	}
	@Test
	public void testassertTrue() {
		assertTrue("hello".contains("o"));
		
		
	}
	@Test
	public void testassertNotSame() {
		String s1="divya";
		String s2="surya";
		assertNotSame(s1,s2);
		
	}

}
