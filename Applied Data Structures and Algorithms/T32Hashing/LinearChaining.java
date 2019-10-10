package T32Hashing;

public class LinearChaining {
	private int capacity;
	private Node[] table;
	private class Node {
		int key;
		Node next;
		Node(int k) {
			key=k;
		}
	}
	public LinearChaining() {
		capacity=8;
		table=new Node[capacity];
	}
	public int hash(int k) {
		return k%capacity;
	}
	public void add(int k) {
		int pos=hash(k);
		Node p=table[pos];
		while(p!=null) {
			if(p.key==k)
				return;
			p=p.next;
		}
		Node temp=new Node(k);
		temp.next=table[pos];
		table[pos]=temp;
	}
	public boolean find(int k) {
		int pos=hash(k);
		Node p=table[pos];
		while(p!=null) {
			if(p.key==k)
				return true;
			p=p.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		LinearChaining t=new LinearChaining();
		t.add(4);
		t.add(5);
		t.add(12);
		t.add(28);
		t.add(29);
		t.add(24);
		for(int i=0;i<t.capacity;i++) {
			System.out.print(i+": ");
			for(Node p=t.table[i];p!=null;p=p.next)
				System.out.print(p.key+" ");
			System.out.println();
		}
		System.out.println(t.find(28));
	}
}
