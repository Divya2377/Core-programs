package junitprograms;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTest {
	@ParameterizedTest
	@ValueSource(strings= {"car","bar","jar","ant"})
	public void endsWith(String str) {
		assertTrue(str.endsWith("r"));
		
	}
	
	

}
