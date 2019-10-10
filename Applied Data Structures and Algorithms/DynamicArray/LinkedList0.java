package T22DynamicArray;

public class LinkedList0 {
	private class Node {
		int data;
		Node next;
		Node(int v,Node n) {
			data=v;
			next=n;
		}
	}
	private Node head,tail;
	
	public void addStart(int v) {
		Node temp=new Node(v,head);
		if(head==null)
			head=tail=temp;
		head=temp;
	}
	public void addEnd(int v) {
		Node temp=new Node(v,null);
		if(tail==null)
			head=tail=temp;
		else
			tail.next=temp;
		tail=temp;
	}
	public void removeStart() {
		if(head==null)
			return;
		if(head.next==null) {
			head=tail=null;
			return;
		}
		head=head.next;
	}
	public void removeEnd() {
		if(tail==null)
			return;
		if(head.next==null) {
			head=tail=null;
			return;
		}
		Node p;
		for(p=head;p.next.next!=null;p=p.next)
			;
		p.next=null;
	}
	
	public void insert(int n,int v) {
		Node p=head;
		for(int i=0;i<n-1;i++)
			p=p.next;
		p.next=new Node(v,p.next);
	}
	public void remove(int n) {
		Node p=head;
		for(int i=0;i<n-1;i++)
			p=p.next;
		p.next=p.next.next;
	}
	
	
	public int size() {
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
		LinkedList0 list=new LinkedList0();
		list.addStart(6);
		list.addStart(7);
		System.out.println(list);
		list.addEnd(3);
		list.addEnd(4);
		System.out.println(list);
		list.addStart(1);
		list.addStart(2);
		System.out.println(list);
		list.addEnd(3);
		list.addEnd(4);
		System.out.println(list);
		for(int i=0;i<3;i++) {
			list.addStart(i);
			list.addEnd(i);
		}
		System.out.println(list+"==");
		list.insert(4,99);
		System.out.println(list+"==");
		list.remove(5);
		System.out.println(list+"==");
		list.removeEnd();
		list.removeEnd();
		list.removeEnd();
		System.out.println(list);
		list.removeStart();
		list.removeStart();
		System.out.println(list);
		System.out.println(list.size());
		for(Node p=list.head;p!=null;p=p.next)
			System.out.print(p.data+" ");
	}
}
