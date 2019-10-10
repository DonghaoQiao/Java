package StringAlgorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LCS {
	public static void getLCS(char[] a,char[] b) {
		int len1=a.length;
		int len2=b.length;
		int[][] c=new int[len1][len2];
		for(int i=len1-1;i>=0;i--) {
			for(int j=len2-1;j>=0;j--) {
				if(a[i]==b[j]) {
					if(i==len1-1||j==len2-1) {
						c[i][j]=1;
					}
					else {
						c[i][j]=c[i+1][j+1]+1;
					}
				}
			}
		}
		System.out.print("  ");
		for(int i=0;i<len1;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		for(int j=0;j<len2;j++) {
			System.out.print(b[j]+" ");
			for(int i=0;i<len1;i++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static String loadFile(String name) throws IOException {
		FileReader fr=new FileReader(name);
		BufferedReader br=new BufferedReader(fr);
		String line;
		String stemp="";
		while((line=br.readLine())!=null) {
			String[] s=line.split("");
			for(String a:s){  
			    stemp+=a;
			}  
		}
		return stemp;
	}
	public static void main(String[] args) throws IOException {
		String a=loadFile("a.txt");
		String b=loadFile("b.txt");
		getLCS(a.toCharArray(),b.toCharArray());
	}
}
