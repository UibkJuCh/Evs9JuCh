package test.java;

import static org.junit.Assert.*;
import main.java.Queue;
import main.java.Stack;

import org.junit.*;


public class Stacktest {
	
	private Stack testStack;
	private Queue testQueue;

	Object a= new Object();
	Object b= new Object();
	Object c= new Object();

	@Before public void  setUp(){
		this.testStack= new Stack(5);
		this.testQueue=new Queue(5);
		/*
		 * Just add or remove the number in the instantiation to use the different Constructors!
		 */
	}
	
	@Test public void testIsEmpty(){
		assertTrue(testStack.isEmpty());
		assertTrue(testQueue.isEmpty());
	}
	
	@Test public void testLenght(){
		assertEquals(testStack.capacity, testStack.length());
		assertEquals(testQueue.capacity, testStack.length());
	}
	
	@Test public void testStackPush() throws Throwable{
		testStack.push(a);
		testStack.push(b);
		testStack.push(c);
		assertEquals(a, testStack.array[0]);
		assertEquals(b, testStack.array[1]);
		assertEquals(c, testStack.array[2]);
		/*
		 * At the First test run, this test failed because there was a bug in the stack class which is described in the class!
		 */
	}
	
	@Test public void testQueuePush(){
		testQueue.push(a);
		testQueue.push(b);
		testQueue.push(c);
		assertEquals(a, testQueue.array[2]);
		assertEquals(b, testQueue.array[1]);
		assertEquals(c, testQueue.array[0]);	
		/*
		 * At the First test run, this test failed because there where a few bugs in the queue class which are described in the class!
		 */
	}
	
	@Test public void testPopQueue(){	
		testQueue.push(a);
		testQueue.push(b);
		testQueue.push(c);
		
		assertEquals(a, testQueue.pop());
		assertEquals(b, testQueue.pop());
		assertEquals(c, testQueue.pop());

		testQueue.pop();
		assertTrue(testQueue.isEmpty());
		/*
		 * At the first run the Pop function doesn't work like it should!
		 * Problem description in the "BaseList" class!
		 */
	}
	
	@Test public void testPopStack() throws Throwable{
		testStack.push(a);
		testStack.push(b);
		testStack.push(c);
		
		assertEquals(c, testStack.pop());
		assertEquals(b, testStack.pop());
		assertEquals(a, testStack.pop());

		testStack.pop();
		assertTrue(testStack.isEmpty());
		/*
		 * Same Problem as in the Test before because its always the same Pop-Method.
		 * Test just made for the sake of completeness!
		 */	
	}

}
