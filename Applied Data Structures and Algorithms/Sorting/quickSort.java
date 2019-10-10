package Sorting;

import java.util.Arrays;

/**
 * 快速排序
 * 时间复杂度: O(nlogn)
 * @param x 待排序数组
 */
public class quickSort {
	/**
	 * 查找出中轴（默认是最低位low）的在x数组排序后所在位置
	 */
	public static void Sort(int[] x,int low,int high) {
		if(low<high) {
			int mid=getMiddle(x,low,high); //将数组x拆分成两部分
			System.out.println("Middle="+mid);
			Sort(x,low,mid-1);  //sort低字段
			Sort(x,mid+1,high);	//sort高字段
		}
		//System.out.println(Arrays.toString(x));
	}
	public static int getMiddle(int[] x,int low,int high) {
		int temp=x[low]; //数组第一个作为中轴
		while(low<high) {
			while(low<high&&x[high]>=temp) {
				high--;
			}
			x[low]=x[high];
			while(low<high&&x[low]<temp) {
				low++;
			}
			x[high]=x[low];
		}
		//System.out.println(" "+Arrays.toString(x));
		x[low]=temp;
		System.out.println(" "+Arrays.toString(x));
		return low; //返回中轴
	}
	public static void main(String[] args) {
		int[] a={9,8,7,6,5,4,3,2,1};
		Sort(a,0,a.length-1);
	}
}
