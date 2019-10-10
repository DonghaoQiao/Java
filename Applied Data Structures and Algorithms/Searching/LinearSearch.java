package T14Searching;

public class LinearSearch {
	public static int Search(int[] x,int t) {
		int n=x.length;
		for(int i=0;i<n;i++) {
			if(x[i]==t)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9};
		int res=Search(a,0);
		if(res !=-1)
			System.out.println(res);
		else
			System.out.println("Not Found");
	}
}



