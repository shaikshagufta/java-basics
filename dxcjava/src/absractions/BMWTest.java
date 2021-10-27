package absractions;



import junit.extensions.TestSetup;
import junit.framework.TestCase;

public class BMWTest extends TestCase {

	public void testAdd() {
		int expected = 30;
		int actual = BMWFlyingCar.add(10, 20);

		assertEquals(expected, actual);
	}

	public void testElgibility() {
		boolean actual = BMWFlyingCar.isEligibletoVote(18);
		assertFalse(actual);
	}
    
	@Override
	protected void setUp() throws Exception { 
		super.setUp();
		System.out.println("i am setting up the environment for test");

	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("i am tearing down the environment");
	}
}
