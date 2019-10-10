package Sorting;

import java.util.*;
/**
 * 冒泡排序
 * 时间复杂度: O(n^2)
 * 依次比较相邻的两个元素。如果第一个比第二个大，就交换他们两个。每次循环都能选出最大的放在“最后一位”。
 * 
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。  
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。 
 * @param x 待排序数组
 */
public class bubbleSort {
	public static void Sort(int[] x) {
		int n=x.length;
		int temp=0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(x[j]>x[j+1]) {
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(x));
		}
	}
	public static void main(String[] args) {
		int[] a={9,8,7,6,5,4,3,2,1};
		Sort(a);
	}
}






