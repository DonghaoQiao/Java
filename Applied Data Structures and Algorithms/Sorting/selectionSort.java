package Sorting;

import java.util.Arrays;
/**
 * ѡ������
 * ʱ�临�Ӷ�: O(n^2)
 * �ҵ������롰���һ������λ�á���
 * 
 * ��δ�����������ҵ����Ԫ�أ���ŵ���������ĩβ��
 * �ٴ�ʣ��δ����Ԫ���м���Ѱ�����Ԫ�أ�Ȼ��ŵ�����������ʼλ�ã�
 * �Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�
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
