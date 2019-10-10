package T21Primes;

public class Power {
	public static int pow(int x,int n) {
		int prod=1;
		while(n>0) {
			if(n%2!=0)
				prod=prod*x;
			x=x*x;
			n/=2;
		}
		return prod;
	}
	public static void main(String[] args) {
		System.out.println(pow(2,5));
	}
}


