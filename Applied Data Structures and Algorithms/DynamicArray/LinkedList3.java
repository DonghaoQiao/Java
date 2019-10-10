package T22DynamicArray;

public class LinkedList3<T> {
	private class Node {
		T data;
		Node next;
	}
	private Node head;
	public void addStart(T v) {
		Node temp=new Node();
		temp.data=v;
		temp.next=head;
		head=temp;
	}
	public void addEnd(T v) {
		if(head==null) {
			head=new Node();
			head.data=v;
			head.next=null;
			return;
		}
		Node p;
		for(p=head;p.next!=null;p=p.next)
			;
		Node temp=new Node();
		temp.data=v;
		temp.next=null;
		p.next=temp;
	}
	public T removeStart() {
		if(head==null)
			return null;
		T v=head.data;
		head=head.next;
		return v;
	}
	public T removeEnd() {
		if(head==null)
			return null;
		
		if(head.next==null) {
			T v=head.data;
			head=null;
			return v;
		}
		Node p=head;
		for(Node q=p.next;q.next!=null;) {
			p=q;
			q=q.next;
		}
		T v=head.data;
		p.next=null;
		return v;
	}
	int size() {
		int count=0;
		for(Node p=head;p!=null;p=p.next)
			count++;
		return count;
	}
	public String toString() {
		Node p=head; 
		StringBuilder sb=new StringBuilder();
		while(p!=null) {
			sb.append(p.data+" ");
			p=p.next;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		LinkedList3 list=new LinkedList3();
		System.out.println(list);
		list.addEnd(3);
		list.addEnd(4);
		System.out.println(list);
		list.addStart(1);
		list.addStart(2);
		System.out.println(list);
		for(int i=0;i<10;i++)
			list.addStart(i);
		System.out.println(list);
		list.removeEnd();
		list.removeEnd();
		System.out.println(list);
		list.removeStart();
		list.removeStart();
		System.out.println(list);
		System.out.println(list.size());
	}
}

