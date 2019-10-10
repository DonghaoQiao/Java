package T22DynamicArray;

import java.util.*;

public class BadGrowArray {
	private int[] data;
	public BadGrowArray() {
		data=new int[6];
		for(int i=0;i<data.length;i++)
			data[i]=i;
	}
	public void addEnd(int v) {
		int[] old=data;
		data=new int[old.length+1];
		for(int i=0;i<old.length;i++)
			data[i]=old[i];
		data[old.length]=v;
	}
	public void addStart(int v) {
		int[] old=data;
		data=new int[old.length+1];
		for(int i=0;i<old.length;i++)
			data[i+1]=old[i];
		data[0]=v;
	}
	public void insert(int i,int v) {
		int[] old=data;
		data=new int[old.length+1];
		for(int j=0;j<i;j++)
			data[j]=old[j];
		data[i]=v;
		for(int j=i+1;j<old.length+1;j++)
			data[j]=old[j-1];
	}
	public void removeEnd() {
		int[] old=data;
		data=new int[old.length-1];
		for(int i=0;i<data.length;i++)
			data[i]=old[i];
	}
	public void removeStart() {
		int[] old=data;
		data=new int[old.length-1];
		for(int i=0;i<data.length;i++)
			data[i]=old[i+1];
	}
	public void remove(int i) {
		int[] old=data;
		data=new int[old.length-1];
		for(int j=0;j<i;j++)
			data[j]=old[j];
		for(int j=i;j<data.length;j++)
			data[j]=old[j+1];
	}
	public int size() {
		return data.length;
	}
	public boolean isEmpty() {
		return data.length==0;
	}
	public String toString() {
		return Arrays.toString(data);
	}
//	~destructor() {
//	delete[] data
//}
	public static void main(String[] args) {
//TODO: must show management of memory
	//delete[] old
		BadGrowArray t=new BadGrowArray();
		System.out.println(t);
		t.addEnd(6);
		System.out.println(t);
		t.addStart(6);
		System.out.println(t);
		t.insert(3,6);
		System.out.println(t);
		t.removeEnd();
		System.out.println(t);
		t.removeStart();
		System.out.println(t);
		t.remove(3);
		System.out.println(t);
		System.out.println("size: "+t.size());
		System.out.println(t.isEmpty());
	}
}





