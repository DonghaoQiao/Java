package StringAlgorithms;

import java.util.Arrays;

/*
 * Given two words word1 and word2, 
 * find the minimum number of steps required to convert word1 to word2. 
 * (each operation is counted as 1 step.)
 * You have the following 3 operations permitted on a word:
 * a) Insert a character
 * b) Delete a character
 * c) Replace a character
 */
public class EditDistance {
	public static void minDistance(String word1,String word2) {
		int len1=word1.length();
		int len2=word2.length();
		int[][] distance=new int[len1+1][len2+1];
		for(int i=0;i<len1+1;i++) {
			distance[i][0]=i;
		}
		for(int j=0;j<len2+1;j++) {
			distance[0][j]=j;
		}
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len2;j++) {
				int min=Math.min(distance[i+1][j],distance[i][j+1])+1;
				if(word1.charAt(i)==word2.charAt(j))
					min=Math.min(min,distance[i][j]);
				else
					min=Math.min(min,distance[i][j]+1);
				distance[i+1][j+1]=min;
			}
		}
		for(int j=0;j<len2;j++) {
			for(int i=0;i<len1;i++) {
				System.out.print(distance[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("It takes "+distance[len1][len2]+" edits to convert file a to file b.");
	}
	public static void main(String[] args) {
		String search="O hell";
		String target="hello";
		minDistance(search,target);
	}
}





