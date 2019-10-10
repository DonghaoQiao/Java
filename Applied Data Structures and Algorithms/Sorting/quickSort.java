package Sorting;

import java.util.Arrays;

/**
 * ��������
 * ʱ�临�Ӷ�: O(nlogn)
 * @param x ����������
 */
public class quickSort {
	/**
	 * ���ҳ����ᣨĬ�������λlow������x�������������λ��
	 */
	public static void Sort(int[] x,int low,int high) {
		if(low<high) {
			int mid=getMiddle(x,low,high); //������x��ֳ�������
			System.out.println("Middle="+mid);
			Sort(x,low,mid-1);  //sort���ֶ�
			Sort(x,mid+1,high);	//sort���ֶ�
		}
		//System.out.println(Arrays.toString(x));
	}
	public static int getMiddle(int[] x,int low,int high) {
		int temp=x[low]; //�����һ����Ϊ����
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
		return low; //��������
	}
	public static void main(String[] args) {
		int[] a={9,8,7,6,5,4,3,2,1};
		Sort(a,0,a.length-1);
	}
}
