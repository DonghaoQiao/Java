package T14Searching;

//二分查找：在有序数组中查找某一特定元素的搜索算法
//O(logn)

public class BinarySearch {
	//Recursion
	public static int Search1(int[] x,int left,int right,int t) {
		if(left<=right) {
			int mid=(left+right)/2;
			if(x[mid]<t)
				return Search1(x,mid+1,right,t);
			else if(x[mid]>t)
				return Search1(x,left,mid-1,t);
			else
				return mid;
		}
		return -1;
	}
	public static int Search2(int[] x,int left,int right,int t) {
		while(left<=right) {
			int mid=(left+right)/2;
			if(x[mid]<t)
				left=mid+1;
			else if(x[mid]>t)
				right=mid-1;
			else
				return mid;
		}		
		return -1;
	}
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9};
		int res=Search1(a,0,a.length-1,2);
		if(res !=-1)
			System.out.println(res);
		else
			System.out.println("Not Found");
	}
}


