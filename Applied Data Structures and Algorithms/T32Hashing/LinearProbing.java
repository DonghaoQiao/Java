package T32Hashing;

public class LinearProbing {
	private int capacity;
	private int used;
	private int[] table;
	public LinearProbing() {
		capacity=8;
		used=0;
		table=new int[capacity];
	}
	public void grow() {
		int[] temp=table;
		capacity*=2;
		table=new int[capacity];
		for(int i=0;i<temp.length;i++) {
			int pos=hash(temp[i]);
			while(table[pos]!=0) {
				pos++;
				if(pos>=table.length)
					pos=0;
			}
			table[pos]=temp[i];
		}
		//delete temp;
	}
	public int hash(int k) {
		return k%capacity;
	}
	public void add(int k) {
		if(used*2>=capacity)
			grow();
		int pos=hash(k);
		while(table[pos]!=0) {
			pos++;
			if(pos>=table.length)
				pos=0;
		}
		used++;
		table[pos]=k;
	}
	public boolean find(int k) {
		int pos=hash(k);
		while(table[pos]!=0) {
			if(table[pos]==k)
				return true;
			pos++;
			if(pos>=table.length)
				pos=0;
		}
		return false;
	}
	public boolean remove(int k) {
		int pos=hash(k);
		while(table[pos]!=0) {
			if(table[pos]==k) {
				table[pos]=0;
				return true;
			}
			pos++;
			if(pos>=table.length)
				pos=0;
		}
		return false;
	}
	public static void main(String[] args) {
		LinearProbing t=new LinearProbing();
		t.add(2);
		t.add(18);
		t.add(4);
		t.add(20);
		t.add(5);
		t.add(21);
		t.add(6);
		
		for(int i=0;i<t.capacity;i++)
			System.out.print(t.table[i]+" ");
	}
}





