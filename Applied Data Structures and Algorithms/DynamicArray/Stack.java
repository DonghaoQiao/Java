package T22DynamicArray;

public class Stack<T> {
	private LinkedList3<T> impl;
	public Stack() {
		impl=new LinkedList3<>();
	}
	public void push(T val) {
		impl.addStart(val);
	}
	public T pop() {
		return impl.removeStart();
	}
	public boolean isEmpty() {
		return impl.size()==0;
	}
}
