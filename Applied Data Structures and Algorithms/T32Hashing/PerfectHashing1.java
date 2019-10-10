package T32Hashing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PerfectHashing1 {
	private static class FirstLayer{
		String[] s;
	}
	FirstLayer[] head;
	int LengthN;
	public PerfectHashing1(int N){
		head = new FirstLayer[N];
		LengthN = N;
		CreateHashing();
	}
	public boolean contains(String s){
		int key1 = hash(s,LengthN);
		if(head[key1] == null) return false;
		else{
			int key2 = hash(s,head[key1].s.length);
			if(head[key1].s[key2].length() == 0 && head[key1].s[key2] == null) return false;
			else if(head[key1].s[key2].equals(s)) return true;
		}
		return false;
	}
	public void CreateHashing(){
		try{
			FileReader fr = new FileReader("dict.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null){
				put(line);
				line = br.readLine();
			}
			fr.close();
		}catch(IOException e){
			
		}
	}
	private void put(String s){
		int key = hash(s,LengthN);
		if(head[key] == null){
			head[key] = new FirstLayer();
			head[key].s = new String[1];
			head[key].s[0] = s;
		}else{
			String[] store = new String[head[key].s.length];
			for(int i = 0; i < head[key].s.length; i++){
				//if(head[key].s[i].length()==0 || head[key].s[i]==null) continue;
					store[i] = head[key].s[i];
			}
			do{
				head[key].s = new String[head[key].s.length+1];
				for(int i = 0; i < store.length; i++){
					if(store[i]!=null && store[i].length()!=0){
						int key2 = hash(store[i], head[key].s.length);
						if(head[key].s[key2]!=null){
							head[key].s = new String[head[key].s.length+1];
							i = 0;
						}else{
							head[key].s[key2] = store[i];
						}
					}
				}
			}while(head[key].s[hash(s,head[key].s.length)] != null);
			head[key].s[hash(s,head[key].s.length)] = s;		
		}
	}
	private int hash(String s, int n) {
	     int intLength = s.length() / 4;
	     long sum = 0;
	     for (int j = 0; j < intLength; j++) {
	       char c[] = s.substring(j * 4, (j * 4) + 4).toCharArray();
	       long mult = 1;
	       for (int k = 0; k < c.length; k++) {
		 sum += c[k] * mult;
		 mult *= 256;
	       }
	     }

	     char c[] = s.substring(intLength * 4).toCharArray();
	     long mult = 1;
	     for (int k = 0; k < c.length; k++) {
	       sum += c[k] * mult;
	       mult *= 256;
	     }

	     return (int) (Math.abs(sum) % n);
	}
	public static void main(String[] arg){
		PerfectHashing1 dic = new PerfectHashing1(10);
		System.out.println(dic.contains("a"));
		System.out.println(dic.contains("apple"));
		System.out.println(dic.contains("wadsa"));
	}
}

