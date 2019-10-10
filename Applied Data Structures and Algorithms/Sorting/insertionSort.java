package Sorting;

import java.util.Arrays;
/**  
 * 插入排序 useful
 * 时间复杂度: O(n^2)
 * int[] a={9,8,7,6,5,4,3,2,1};
    first pass: 8 9
   second pass: 7 8 9
    third pass: 6 7 8 9
 * 
 * 从第一个元素开始，该元素可以认为已经被排序
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描 
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置  
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置  
 * 将新元素插入到该位置中  
 * 重复步骤2  
 * @param x  待排序数组
 */  
public class insertionSort {
	public static void Sort(int[] x) {
		int n=x.length;
		for(int i=1;i<n;i++) {
			int temp=x[i];
			for(int j=i;j>0;j--) {
				if(x[j-1]>x[j]) {
					x[j]=x[j-1];
					x[j-1]=temp;
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





