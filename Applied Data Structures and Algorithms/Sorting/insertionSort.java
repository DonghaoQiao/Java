package Sorting;

import java.util.Arrays;
/**  
 * �������� useful
 * ʱ�临�Ӷ�: O(n^2)
 * int[] a={9,8,7,6,5,4,3,2,1};
    first pass: 8 9
   second pass: 7 8 9
    third pass: 6 7 8 9
 * 
 * �ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
 * ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ�� 
 * �����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ��  
 * �ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ��  
 * ����Ԫ�ز��뵽��λ����  
 * �ظ�����2  
 * @param x  ����������
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





