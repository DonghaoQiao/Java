package T22DynamicArray;

public class Queue<T> {
	private LinkedList3<T> impl;
	public Queue() {
		impl=new LinkedList3<>();
	}
	public void enqueue(T val) {
		impl.addStart(val);
	}
	public T dequeue() {
		return impl.removeEnd();
	}
	public boolean isEmpty() {
		return impl.size()==0;
	}
}
