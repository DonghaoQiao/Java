package Sorting;
import java.util.Arrays;

/**  
 * ������ useful
 * ʱ�临�Ӷ�: O(nlogn)
 * ÿ��ѡ�����������һ������λ��
 * 
 * @param x  ����������
 */ 
public class heapSort {
	public static void buildHeap(int[] x,int lastIndex) {
		for(int j=(lastIndex-1)/2;j>=0;j--) { //jΪ�����жϵĽڵ�
			int i=j;
			while(2*i+1<=lastIndex) { //ȷ���ӽڵ����
				int biggerIndex=2*i+1;
				if(biggerIndex<lastIndex) { //�ж��Ƿ�����ҽڵ�
					if(x[biggerIndex]<x[biggerIndex+1]) { //�Ƚ������ӽڵ�
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


