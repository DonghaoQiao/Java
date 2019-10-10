package Shuffling;

import java.util.Arrays;
import java.util.Random;

public class naiveShuffle {
	public static void Shuffle(int[] x) {
		int n=x.length;
		int[] result=new int[n];
		Random rd=new Random();
		for(int i=0;i<n;i++) {
			int index=rd.nextInt(n);
			while(x[index]==0) {
				index=rd.nextInt(n);
			}
			result[i]=x[index];
			x[index]=0;
		}
		System.out.println(Arrays.toString(result));
	}
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		Shuffle(a);
	}
}
