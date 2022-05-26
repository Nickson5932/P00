import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		// Arrange
		int a = 4321;
		int b = 1234;
		
		// Act
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		// Assert
		int expected = 5555;
		assertEquals(expected, actual);
		
		// fail("Not yet implemented");
	}
	
	@Test
	public void testSubstract() {
		// Arrange
		int a = 4;
		int b = 1;
		
		// Act
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
		
		// Assert
		int expected = 3;
		assertEquals(expected, actual);
		
		// fail("Not yet implemented");
	}
	
	@Test
	public void testMultiple() {
		// Arrange
		int a = 4;
		int b = 2;
		
		// Act
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		// Assert
		int expected = 8;
		assertEquals(expected, actual);
		
		// fail("Not yet implemented");
	}
	
	@Test
	public void testDevide() {
		// Arrange
		int a = 4;
		int b = 2;
		
		// Act
		Calculator cal = new Calculator();
		int actual = cal.devide(a, b);
		
		// Assert
		int expected = 2;
		assertEquals(expected, actual);
		
		// fail("Not yet implemented");
	}

}
