package junitprograms;

import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

public class AssumptionsDemo {
	@Test
	public void testonAssumptiion() {
		int a=5,s=25;
		Assumptions.assumeFalse(s!=a*a);
		System.out.println("it will be displayed");
		
		
	}
	@Test
	public void assumptionTest() {
		int a=5,s=25;
		Assumptions.assumeTrue(s==a*a);
	}
	@Test
	public void testAssumption() {
		int a=5,b=6;
		Assumptions.assumingThat(a==b, ()->{System.out.println("testing a==b");});
		
	}

}
