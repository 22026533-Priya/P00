import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		
		int a = 1234;
		int b = 8765;
		
			Calculator cal = new Calculator();
			int actual = cal.add(a, b);
			
			int expected = 9999;
			assertEquals (actual, expected);
	}
	
	@Test
	public final void testSubtract() {
		//fail("Not yet implemented");
		
		int a = 9876;
		int b = 4321;
		
			Calculator cal = new Calculator();
			int actual = cal.subtract(a, b);
			
			int expected = 5555;
			assertEquals (actual, expected);
	}
	
	public final void testMultiple() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		
	Calculator cal = new Calculator();
	int actual = cal.multiple(a, b);
			
	int expected = 42674196;
	assertEquals (actual, expected);
	}

	
	@Test
	public final void testDivide() {
		//fail("Not yet implemented");
		
		int a = 8;
		int b = 4;
		
			Calculator cal = new Calculator();
			int actual = cal.divide(a, b);
			
			int expected = 2;
			assertEquals (actual, expected);
	}

}
