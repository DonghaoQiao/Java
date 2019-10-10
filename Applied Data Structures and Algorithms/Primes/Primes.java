package T21Primes;
import java.util.*;

public class Primes {
	public static boolean bruteForceIsPrime1(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static boolean bruteForceIsPrime2(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static int countPrimes1(int n) {
		int count=0;
		for(int i=2;i<=n;i++)
			if(bruteForceIsPrime2(i))
				count++;
		return count;
	}
	public static int countPrimes2(int n) {
		int count=1;
		for(int i=3;i<=n;i+=2)
			if(bruteForceIsPrime2(i))
				count++;
		return count;
	}
	public static void main(String[] args) {
		System.out.println(bruteForceIsPrime1(341));
		System.out.println(bruteForceIsPrime2(5));
		System.out.println(countPrimes1(100));
		System.out.println(countPrimes2(100));
	}
}
