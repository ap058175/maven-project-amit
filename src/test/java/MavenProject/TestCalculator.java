package MavenProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	Calculator calc=new Calculator();
	

	@Test
	public void test_diff() {
		assertEquals(10,calc.diff(20, 10));
		assertEquals(0,calc.diff(1, 1));
		assertEquals(-2,calc.diff(-1, 1));
	}
	
}
