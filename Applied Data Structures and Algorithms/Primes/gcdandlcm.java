package T21Primes;

public class gcdandlcm {
	public static int gcd(int a,int b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
	public static int gcd1(int a,int b) {
		while(b!=0) {
			int rem=a%b;
			a=b;
			b=rem;
		}
		return a;
	}
	public static int lcm(int a,int b) {
		return a*b/gcd(a,b);
	}
	public static void main(String[] args) {
		System.out.println(gcd(10,30));
		System.out.println(gcd1(8,24));
		System.out.println(lcm(10,30));
	}
}
