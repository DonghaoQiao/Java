package Sorting;

import java.util.Arrays;

/**
 * 归并排序
 * 时间复杂度为O(nlogn)
 * 简介:将两个（或两个以上）有序表合并成一个新的有序表 即把待排序序列分为若干个子序列，
 * 每个子序列是有序的。然后再把有序子序列合并为整体有序序列
 * 稳定排序方式
 * @param x 待排序数组
 */
public class mergeSort {
	public static void Sort(int[] x,int low,int high) {
		int mid=(low+high)/2;
		if(low<high) {
			Sort(x,low,mid); //sort左边
			Sort(x,mid+1,high); //sort右边
			merge(x,low,mid,high); //merge
			System.out.println(Arrays.toString(x));
		}
	}
	//将数组中low到high位置的数进行排序
	public static void merge(int[] x,int low,int mid,int high) {
		int[] temp=new int[high-low+1];
		int i=low,j=mid+1,k=0;
		//较小的数移入新数组
		while(i<=mid&&j<=high) {
			if(x[i]<x[j])
				temp[k++]=x[i++];
			else
				temp[k++]=x[j++];
			System.out.println(" "+Arrays.toString(temp));
		}
		while(i<=mid) {
			temp[k++]=x[i++];
		}
		while(j<=high) {
			temp[k++]=x[j++];
		}
		//新数组覆盖旧数组
		for(int i0=0;i0<temp.length;i0++) {
			x[i0+low]=temp[i0];
			System.out.println("   "+Arrays.toString(temp));
		}		
	}
	public static void main(String[] args) {
		int[] a={9,8,7,6,5,4,3,2,1};
		Sort(a,0,a.length-1);
	}
}


