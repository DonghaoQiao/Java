package T21Primes;

public class EratosthenesImproved { //O(nloglogn)
	public static boolean[] Eratosthenes(int n) {
		boolean[] prime=new boolean[n+1];
		for(int i=0;i<=n;i++)
			prime[i]=true;
		prime[0]=prime[1]=false;
		for(int i=4;i<=n;i+=2)
			prime[i]=false;
		for(int i=0;i<=n;i++) {
			if(prime[i]) {
				for(int j=i*i;j<=n;j+=2*i)
					prime[j]=false;
			}
		}
		return prime;
	}
	public static void main(String[] args) {
		int n=100;
		boolean prime[]=Eratosthenes(n);
		for(int i=0;i<prime.length;i++) {
			if(prime[i])
				System.out.print(i+" ");
		}
	}
}
