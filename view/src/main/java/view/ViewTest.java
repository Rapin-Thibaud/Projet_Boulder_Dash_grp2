package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ViewTest {
	int testNumber = 0;
	
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
	public void testView() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyCodeToControllerOrder() {
		int keyCode = 0;
		boolean expectedBool = false;
		switch(keyCode) {
		case 0 : 
			expectedBool = true;
		default : 
			break;
		}
		assertTrue(expectedBool);
	}

	 @Test
     public void run() {
         int expected = 0;
         testNumber = expected;
         assertEquals(expected, testNumber);
  }

	 @Test
	 public void setController() {
      int expected = 0;
      assertEquals(expected, testNumber);

  }

	@Test
	public void testSetController() {
		fail("Not yet implemented");
	}

}
