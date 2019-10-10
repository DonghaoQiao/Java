package T21Primes;

public class MillerRabin {
	public static boolean mr(int n,int k) {
		if(n<2)
			return false;
		if(n==2)
			return true;
		int s=0;
		int d=n-1;
		while(d%2==0) {
			s++;
			d/=2;
		}
		outer:
			for(int i=1;i<=k;i++) {
				int a=(int)(Math.random()*(n-4))+2;
				int x=powermod(a,d,n);
				if(x!=1&&x!=n-1) {
					for(int j=0;j<s;j++) {
						x=x*x%n;
						if(x==1)
							return false;
						if(x==n-1)
							continue outer;
					}
					return false;
				}
			}
		return true;
	}
	public static int powermod(int x,int n,int m) {
		int prod=1;
		while(n>0) {
			if(n%2!=0)
				prod=prod*x%m;
			x=x*x%m;
			n/=2;
		}
		return prod;
	}
	public static void main(String[] args) {
		for(int i=2;i<=20;i++) {
			System.out.println(i+" "+mr(i,2));
		}
		System.out.println(mr(561,2));
		System.out.println(mr(17,2));
	}
}