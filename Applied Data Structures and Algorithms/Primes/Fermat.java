package T21Primes;

public class Fermat {
	public static boolean fermat(int p,int k) {
		boolean temp=false;
		for(int i=0;i<k;i++) {
			int a=(int)(Math.random()*(p-4))+2;
			if(powermod(a,p-1,p)!=1)
				temp=false;
			else
				temp=true;
		}
		return temp;
	}
	public static int powermod(int x,int n,int m) {
		int prod=1;
		while(n>0) {
			if(n%2 !=0)
				prod=prod*x%m;
			x=x*x%m;
			n/=2;
		}
		return prod%m;
	}
	public static void main(String[] args) {
		boolean res=fermat(561,3);
		System.out.println(res);
	}
}
