package junitprograms;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FirstTest {
	@Test
	void display()
	{
		System.out.println("Hello");
	}
	@Test
	@Disabled
	void display2()
	{
		System.out.println("Hai");
	}

}
