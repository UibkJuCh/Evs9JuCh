package main.java;

public class Queue extends BaseList {
	
	

	/**
	 * Constructors added in Order to create a QueueObject! 
	 */
	public Queue() {
		super();
	}

	/**
	 * @param capacity
	 */
	public Queue(int capacity) {
		super(capacity);
	}

	@Override
	public void push(Object obj) {
		if (count >= array.length) doubleSize();
		/*
		 * The If statement has to be changed to "(count >= array.length)" because with only the > instead of >= the arraysize
		 * will be increased to late and the for loop will throw an exception!
		 */
		for (int i = count - 1; i >= 0; i--) array[i+1] = array[i];
		/*
		 * "array[i] = array[i+1]" is false because in this case the object placed at the index i will be always overwritten with null!
		 * Solution: "array[i+1] = array[i]"
		 */
		array[0] = obj;
		count++;
	}

}
