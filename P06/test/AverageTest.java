import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AverageTest {

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
	public void testAverage() {
		
		int a = 4;
		int b = 1;
		int c = 3;
		int d = 2;
		int e = 5;
		
		// Act
		Average cal = new Average();
		int actual = cal.avg(a, b, c, d, e); 
		
		// Assert
		int expected = 3;
		assertEquals(expected, actual);
		
		//fail("Not yet implemented");
	}

}
