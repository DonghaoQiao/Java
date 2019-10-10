package StringAlgorithms;

public class boyerMoore {
	public static int BoyerMoore(String s,String t) {
		int len1=s.length();
		int len2=t.length();
		int[] map=new int[255];
		for(int i=0;i<len2;i++) {
			map[t.charAt(i)]=i+1;
		}
		int i=len2-1;
		while(i<len1) {
			for(int j=0;j<len2;j++) {
				if(j==len2-1&&s.charAt(i-j)==t.charAt(len2-1-j))
					return i-len2+1;
				if(s.charAt(i-j)==t.charAt(len2-1-j))
					continue;
				i=map[s.charAt(i-j)]==0?i+len2-j:i+len2-map[s.charAt(i-j)];
				break;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String search="helooabcdhaloo";
		String target="al";
		int res=BoyerMoore(search,target);
		System.out.println(res);
	}
}
