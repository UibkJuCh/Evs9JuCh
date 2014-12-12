package main.java;

public class BoundedStack extends Stack {

	/**
	 * @param capacity
	 */
	public BoundedStack(int capacity) {
		super(capacity);
	}

	@Override
	public void push(Object obj) throws Throwable {
		
		if(count<capacity){
		array[count]= obj;
		count++;
		}
		else{
			throw new FullStackException();
		}
			
	}
	public boolean isFull(){
		return count==capacity;
	}
	@Override
	public int length(){
		return count;
		
	}

}
