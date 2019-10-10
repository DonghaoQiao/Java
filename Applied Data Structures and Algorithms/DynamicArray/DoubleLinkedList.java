package T22DynamicArray;

public class DoubleLinkedList implements Cloneable {
	private class Node {
		int data;
		Node next,prev;
		Node(int v,Node n,Node p) {
			data=v;next=n;prev=p;
		}
	}
	private Node head,tail;
//	public DoubleLinkedList1() {
//		head=null;tail=null;
//	}
	
	public DoubleLinkedList clone() {
		DoubleLinkedList copy=new DoubleLinkedList();
		if (head==null) { //this list is empty
			copy.head=null;
			copy.tail=null;
			return copy;
		}
		copy.head=new Node(head.data,null,null);
		if (head.next==null) {
			return copy;
		}
		//guaranteed: at least 2 elements in this
		//q points to the new ones
		Node q=copy.head;
		//p points to 2nd element of the original list (this)
		for (Node p=head.next;p!=null;p=p.next) {
			Node temp=new Node(p.data,null,q);
			q.next=temp;
			q=q.next;
		}
		return copy;
	}
	
	public void addStart(int v) {
		Node temp=new Node(v,head,null);
		if(head==null)
			head=tail=temp;
		else
			head.prev=temp;
		head=temp;
	}
	public void addEnd(int v) {
		Node temp=new Node(v,null,tail);
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
		head.prev=null;
	}
	public void removeEnd() {
		if(tail==null)
			return;
		if(tail.prev==null) {
			head=tail=null;
			return;
		}
		tail=tail.prev;
		tail.next=null;
	}	
	public int size() {
		int count=0;
		for(Node p=head;p!=null;p=p.next)
			count++;
		return count;
	}
	public static class Iterator {
		private Node current;
		public Iterator(DoubleLinkedList list) {
			current=list.head;
		}
		public boolean hasNext() {
			return current!=null;
		}
		public void next() {
			current=current.next;
		}
		public int getValue() {
			return current.data;
		}
	}

	public static void main(String[] args) {
		DoubleLinkedList list=new DoubleLinkedList();
		for(int i=0;i<10;i++) {
			list.addStart(i);
			list.addEnd(i);
		}
		for(Node p=list.head;p!=null;p=p.next)
			System.out.print(p.data+" ");
		System.out.println();
		for(int i=0;i<5;i++) {
			list.removeEnd();
			list.removeStart();
		}
		for(Node p=list.head;p!=null;p=p.next)
			System.out.print(p.data+" ");
		System.out.println();
		
		for(DoubleLinkedList.Iterator i=new DoubleLinkedList.Iterator(list);
				i.hasNext();i.next()) {
			System.out.print(i.getValue()+" ");
		}
		
		System.out.println();
		System.out.println(list.size());
		
		for(Node p=list.clone().head;p!=null;p=p.next)
			System.out.print(p.data+" ");
		System.out.println();
	}
}





