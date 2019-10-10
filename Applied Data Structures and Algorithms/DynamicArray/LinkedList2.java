package T22DynamicArray;

public class LinkedList2 {
	private class Node {
		int data;
		Node next;
	}
	private Node head;
	public void addStart(int v) {
		Node temp=new Node();
		temp.data=v;
		temp.next=head;
		head=temp;
	}
	public void addEnd(int v) {
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
		for(Node q=p.next;q.next!=null;) {
			p=q;
			q=q.next;
		}
//TODO
//		for(p=head;p.next.next!=null;p=p.next)
//			;
		
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
		LinkedList2 list=new LinkedList2();
		System.out.println(list);
		list.addEnd(3);
		list.addEnd(3);
		System.out.println(list);
		list.addStart(1);
		list.addStart(2);
		System.out.println(list);
		for(int i=0;i<=4;i++)
			list.addStart(i);
		for(int i=0;i<=4;i++)
			list.addEnd(i);
		System.out.println(list+"==");
		list.removeEnd();
		list.removeEnd();
		System.out.println(list);
		list.removeStart();
		list.removeStart();
		System.out.println(list);
		System.out.println(list.size());
	}
}

