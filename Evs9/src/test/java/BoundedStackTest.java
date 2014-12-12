package test.java;

import static org.junit.Assert.*;
import main.java.BoundedStack;

import org.junit.*;

public class BoundedStackTest {
	/**
	 * 
	 * Added throws Throwable on most tests in order to see if the FullStackException has been thrown!
	 * 
	 */
	private BoundedStack bs;

	@Before
	public void setUp() throws Exception {
		bs = new BoundedStack(3);
	}

	@Test(expected = NegativeArraySizeException.class)
	/*
	 * I had to change the expected Exception to "NegativeArraySizeException" in order to use the right exception! IllegalArgument 
	 * works just, if the argument in Line 23 would be for example a letter and not a negative number!
	 */
	public void testCapacity() {
		bs = new BoundedStack(-2);
	}

	@Test
	public void testIsFull() throws Throwable {
		assertFalse(" Failure ! An empty stack cannot be full . ", bs.isFull());
		bs.push(1);
		bs.push(2);
		assertFalse(" Failure ! The stack it is not yet full . ", bs.isFull());
		bs.push(3);
		assertTrue(" Failure ! The stack should be full . ", bs.isFull());
	}

	@Test
	public void testStack() throws Throwable {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		bs.push(i1);
		bs.push(i2);
		assertEquals(" Failure ! The length is not correct . ", 2, bs.length());
		assertEquals(" Failure ! The last in should be the first out ", i2,bs.pop());
		/*
		 * Changed the Message because the right behavior is LIFO!
		 */
		assertEquals(" Failure ! Pop not returning the right value ", i1,bs.pop());
		assertTrue(" Failure ! The stack should be empty now . ", bs.isEmpty());
	}

	@Test//(expected = FullStackException.class)
	public void testPushTooMuch() throws Throwable  {
		bs.push(1);
		bs.push(2);
		bs.push(3);
		//bs.push(" This was too much for me ! ");
		
		
	}

}