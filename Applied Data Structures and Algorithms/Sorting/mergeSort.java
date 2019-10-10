package Sorting;

import java.util.Arrays;

/**
 * �鲢����
 * ʱ�临�Ӷ�ΪO(nlogn)
 * ���:�����������������ϣ������ϲ���һ���µ������ ���Ѵ��������з�Ϊ���ɸ������У�
 * ÿ��������������ġ�Ȼ���ٰ����������кϲ�Ϊ������������
 * �ȶ�����ʽ
 * @param x ����������
 */
public class mergeSort {
	public static void Sort(int[] x,int low,int high) {
		int mid=(low+high)/2;
		if(low<high) {
			Sort(x,low,mid); //sort���
			Sort(x,mid+1,high); //sort�ұ�
			merge(x,low,mid,high); //merge
			System.out.println(Arrays.toString(x));
		}
	}
	//��������low��highλ�õ�����������
	public static void merge(int[] x,int low,int mid,int high) {
		int[] temp=new int[high-low+1];
		int i=low,j=mid+1,k=0;
		//��С��������������
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
		//�����鸲�Ǿ�����
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


