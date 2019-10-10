package T33Matrices;

public class Matrix {
	private double[] m;
	private int row,col;
	public Matrix(int r,int c) {
		m=new double[r*c];
		row=r;
		col=c;
	}
	public Matrix add(Matrix a) {
		if(a.row!=row||a.col!=col)
			throw new RuntimeException("Bad Size");
		Matrix temp=new Matrix(row,col);
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				temp.m[i*col+j]=m[i*col+j]+a.m[i*col+j];
			}
		}
		for(int i=0;i<row*col;i++) {
			temp.m[i]=m[i]+a.m[i];
		}
		return temp;
	}
	public Matrix multi(Matrix a) {
		if(col!=a.row)
			throw new RuntimeException("Bad Size");
		Matrix temp=new Matrix(row,a.col);
		for(int i=0;i<row;i++) {
			for(int j=0;j<a.col;j++) {
				int sum=0;
				for(int k=0;k<col;k++) {
					sum+=m[i*col+k]*a.m[k*a.col+j];
				}
				temp.set(i, j, sum);
			}
		}
		return temp;
	}
	public void set(int i,int j,double v) {
		m[i*col+j]=v;
	}
	public double get(int i,int j) {
		return m[i*col+j];
	}
	public void print() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(m[i*col+j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Matrix m1=new Matrix(2,2);
		m1.set(0, 0, 2);
		m1.set(0, 1, 2);
		m1.set(1, 0, 2);
		m1.set(1, 1, 2);
		Matrix m2=new Matrix(2,2);
		m2.set(0, 0, 3);
		m2.set(1, 0, 3);
		m2.set(0, 1, 4);
		m2.set(1, 1, 4);
		m1.print();
		m2.print();
		m1.add(m2).print();
	}
}




