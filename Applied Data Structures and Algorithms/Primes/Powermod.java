package T21Primes;

public class Powermod {
	public static int mod(int x,int n,int m) {
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
		System.out.println(mod(2,10,5));
	}
}
