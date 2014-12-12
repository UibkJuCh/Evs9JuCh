package main.java;

import java.util.Arrays;

public abstract class BaseList {
	
	private static int INITIAL_CAPACITY = 2;
	public int capacity;
	public Object array[];
	protected int count;
	
	protected BaseList(int capacity) {
		this.capacity = capacity;
		this.array = new Object[capacity];
		this.count = 0;
	}
	
	protected BaseList() {
		this(INITIAL_CAPACITY);
	}
	
	public abstract void push(Object obj) throws Throwable;
	
	protected void doubleSize() {
		array = Arrays.copyOf(array, 2 * array.length);
	}
	
	public Object pop() {
		if (isEmpty()) return null;
		Object item=array[--count];
		array[count]=array[count+1];
		return item;
		/*
		 * The return statement of this function was wrong!
		 * The value of the array hasn't changed!
		 * Solution:"array[--count]=array[count+1]" The value will be overwritten with the value of the next object which doesn't exist
		 * 											so the value will be null!
		 * 
		 * The previously saved top item will be returned!
		 */
		
	}
	
	public Boolean isEmpty() {
		return count == 0; 
	}
	
	public int length() {
		return capacity;
	}
	
}
