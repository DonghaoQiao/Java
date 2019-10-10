package T22DynamicArray;

import java.util.*;

public class GoodGrowArray {
	private int[] data;
	private int used;
	public GoodGrowArray() {
		data=new int[1];
		used=0;
	}
	private void grow() {
		if(used<data.length)
			return;
		int[] temp=data;
		data=new int[2*used];
		for(int i=0;i<used;i++) {
			data[i]=temp[i];
		}
		//delete[] temp
	}
	public void addEnd(int v) { //O(1)
		grow();
		data[used]=v;
		used++;
	}
	public void addStart(int v) { //O(n)
		grow();
		for(int i=data.length-1;i>0;i--)
			data[i]=data[i-1];
		data[0]=v;
		used++;
	}
	public void removeEnd() {
		used--;
		data[used]=0;
	}
	public void removeStart() {
		used--;
		for(int i=0;i<used;i++)
			data[i]=data[i+1];
		data[used]=0;
	}
	public String toString() {
		return Arrays.toString(data);
	}
//	~destructor() {
//	delete[] data
//}
	public static void main(String[] args) {
		GoodGrowArray t=new GoodGrowArray();
		for(int i=0;i<6;i++)
			t.addEnd(i);
		System.out.println(t);
		
		t.addStart(4);
		System.out.println(t);
		t.removeEnd();
		t.removeEnd();
		t.removeEnd();
		System.out.println(t);
		t.removeStart();
		System.out.println(t);
	}
}





