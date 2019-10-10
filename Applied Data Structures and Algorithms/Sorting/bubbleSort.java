package Sorting;

import java.util.*;
/**
 * ð������
 * ʱ�临�Ӷ�: O(n^2)
 * ���αȽ����ڵ�����Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������ÿ��ѭ������ѡ�����ķ��ڡ����һλ����
 * 
 * ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������  
 * ������е�Ԫ���ظ����ϵĲ��裬�������һ����
 * ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ� 
 * @param x ����������
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






