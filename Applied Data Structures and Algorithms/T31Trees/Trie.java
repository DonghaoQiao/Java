package T31Trees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Trie {
	private class Node {
		Node[] next;
		boolean isWord;
		Node() {
			next=new Node[26];
		}
	}
	private Node root;
	public Trie() {
		root=new Node();
	}
	
	public void insert(String word) {
		Node p=root;
		for(int i=0;i<word.length();i++) {
			if(p.next[word.charAt(i)-97]==null)
				p.next[word.charAt(i)-97]=new Node();
			p=p.next[word.charAt(i)-97];
		}
		p.isWord=true;
	}
	public boolean contains(String word) {
		Node p=root;
		for(int i=0;i<word.length();i++) {
			if(p.next[word.charAt(i)-97]==null)
				return false;
			p=p.next[word.charAt(i)-97];
		}
		return p.isWord;
	}
	public boolean containsPrefix(String word) {
		Node p=root;
		for(int i=0;i<word.length();i++) {
			if(p.next[word.charAt(i)-97]==null)
				return false;
			p=p.next[word.charAt(i)-97];
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		Trie t=new Trie();
		Scanner s=new Scanner(new BufferedReader(new FileReader("dict.txt")));
		while(s.hasNext()) {
			t.insert(s.nextLine());
		}
		s.close();
		
		Scanner test=new Scanner(new BufferedReader(new FileReader("hw5.txt")));
		while(test.hasNext()) {
			System.out.println(t.contains(test.nextLine()));
		}
		test.close();
	}
}




