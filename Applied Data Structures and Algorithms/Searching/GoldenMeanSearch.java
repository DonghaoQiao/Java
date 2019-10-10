package T14Searching;

public class GoldenMeanSearch {
	static double PHI=(1+Math.sqrt(5))/2;
	public static double f(double x) {
		return (x-2)*(x-1);
	}
	public static void Search(double left,double right,double eps) {
		double s=(right-left)/PHI;
		double a=right-s;
		double b=left+s;
		double ya=f(a);
		double yb=f(b);
		while(Math.abs(b-a)>eps) {
			if(ya<yb) {
				right=b;
				b=left+(right-left)/PHI;
				yb=f(b);
			}
			else {
				left=a;
				a=right-(right-left)/PHI;
				ya=f(a);
			}
		}
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		Search(-1,4,0.001);
	}
}
