package Sorting;

import java.util.Arrays;
/**
 * 选择排序
 * 时间复杂度: O(n^2)
 * 找到最大的与“最后一个数换位置”。
 * 
 * 在未排序序列中找到最大元素，存放到排序序列末尾，
 * 再从剩余未排序元素中继续寻找最大元素，然后放到排序序列起始位置，
 * 以此类推，直到所有元素均排序完毕。
 * @param x
 */
public class selectionSort {
	public static void Sort(int[] x) {
		int n=x.length;
		for(int i=n-1;i>0;i--) {
			int k=i;
			for(int j=0;j<=i;j++) {
				if(x[j]>x[k]) {
					k=j;
				}
			}
			int temp=x[i];
			x[i]=x[k];
			x[k]=temp;
			System.out.println(Arrays.toString(x));
		}
	}
	public static void main(String[] args) {
		int[] a={9,8,7,6,5,4,3,2,1};
		Sort(a);
	}
}
