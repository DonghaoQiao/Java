package Shuffling;

import java.util.Arrays;
import java.util.Random;

public class FisherYates {
	public static void Shuffle(int[] x) {
		int n=x.length;
		Random rd=new Random();
		for(int i=0;i<n;i++) {
			int index=rd.nextInt(i+1);
			int temp=x[index];
			x[index]=x[i];
			x[i]=temp;
		}
		System.out.println(Arrays.toString(x));
	}
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		Shuffle(a);
	}
}