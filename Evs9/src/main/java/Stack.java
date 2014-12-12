package main.java;

public class Stack extends BaseList {
	

	/*
	 *Constructors added in Order to create a StackObject! 
	 */
	public Stack() {
		super();
		
	}

	/**
	 * @param capacity
	 */
	public Stack(int capacity) {
		super(capacity);
		
	}

	@Override
	public void push(Object obj) throws Throwable {
		if (count == array.length) doubleSize();
		array[count] = obj;
		/*
		 * After pushing an Object into the Stack the counter didn't count up, so if we want to put
		 * another element into the Stack it always overrides the Element that is in the Stack!
		 * Solution: add "count++"
		 */
		count++;
	}
	

}
