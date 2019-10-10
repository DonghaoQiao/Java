package T22DynamicArray;

public class LinkedList1 {
	private class Node {
		int data;
		Node next;
		Node(int v,Node n) {
			data=v;
			next=n;
		}
	}
	private Node head;
	private Node tail() { //O(n)
		Node p=head;
		if(p==null)
			return null;
		for(p=head;p.next!=null;p=p.next)
			;
		return p;
	}
	public void addStart(int v) {
		head=new Node(v,head);
	}
	public void addEnd(int v) {
		if(head==null) {
			head=new Node(v,null);
			return;
		}
		//tail().next=new Node(v,null);
		Node p;
		for(p=head;p.next!=null;p=p.next)
			;
		p.next=new Node(v,null);
	}
	public void removeStart() {
		if(head==null)
			return;
		head=head.next;
	}
	public void removeEnd() {
		if(head==null)
			return;
		if(head.next==null) {
			head=null;
			return;
		}
		Node p=head;
//		for(Node q=p.next;q.next!=null;) {
//			p=q;
//			q=q.next;
//		}
//TODO
		for(p=head;p.next.next!=null;p=p.next)
			;
		p.next=null;
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
		LinkedList1 list=new LinkedList1();
		System.out.println(list);
		list.addEnd(3);
		list.addEnd(4);
		System.out.println(list);
		list.addStart(1);
		list.addStart(2);
		System.out.println(list);
		for(int i=0;i<10;i++)
			list.addStart(i);
		for(int i=0;i<10;i++)
			list.addEnd(i);
		System.out.println(list+"===");
		list.removeEnd();
		list.removeEnd();
		list.removeEnd();
		System.out.println(list);
		list.removeStart();
		System.out.println(list);
		
		for(Node p=list.head;p!=null;p=p.next)
			System.out.print(p.data+" ");
		
		System.out.println();
		System.out.println(list.size());
	}
}
