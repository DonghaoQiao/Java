package Sorting;
import java.util.Arrays;

/**  
 * 堆排序 useful
 * 时间复杂度: O(nlogn)
 * 每次选出最大的与最后一个交换位置
 * 
 * @param x  待排序数组
 */ 
public class heapSort {
	public static void buildHeap(int[] x,int lastIndex) {
		for(int j=(lastIndex-1)/2;j>=0;j--) { //j为正在判断的节点
			int i=j;
			while(2*i+1<=lastIndex) { //确定子节点存在
				int biggerIndex=2*i+1;
				if(biggerIndex<lastIndex) { //判断是否存在右节点
					if(x[biggerIndex]<x[biggerIndex+1]) { //比较左右子节点
						biggerIndex++;
					}
				}
				if(x[i]<x[biggerIndex]) {
					int temp=x[i];
					x[i]=x[biggerIndex];
					x[biggerIndex]=temp;
					i=biggerIndex;
				}
				else {
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a={9,8,7,6,5,4,3,2,1};
		int n=a.length;
		for(int i=n-1;i>=0;i--) {
			buildHeap(a,i);
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			System.out.println(Arrays.toString(a));
		}
	}
}


