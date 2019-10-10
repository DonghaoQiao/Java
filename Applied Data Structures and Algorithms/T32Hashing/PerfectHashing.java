package T32Hashing;

public class PerfectHashing {
	private int capacity;
	private int n;
	private int used;
	private Node[] table;
	private class Node {
		int key;
		Node[] next;
		Node() {
			next=new Node[n];
		}
	}
	
	public PerfectHashing() {
		capacity=8;
		used=0;
		table=new Node[capacity];
	}
	public void grow() {
		Node[] temp=table;
		capacity*=2;
		for(int i=0;i<capacity;i++)
			table[i]=temp[i];
		//delete temp;
	}
	public void grow2() {
		
	}
	public int hash(int k) {
		return k%capacity;
	}
	public int hash2(int k) {
		return k%n;
	}
	public void add(int k) {
		if(used*2>=capacity)
			grow();
		int pos=hash(k);
		int pos2=hash2(k);
		Node p=table[pos];
		while(p.next[pos2]!=null) {
			if(p.next[pos2].key==k)
				return;
			grow2();
		}
		p.next[pos2].key=k;
	}
	
	public static void main(String[] args) {
		PerfectHashing t=new PerfectHashing();
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
	}
}
