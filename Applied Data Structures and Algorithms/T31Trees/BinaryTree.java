package T31Trees;

public class BinaryTree {
	private class Node {
		int data;
		Node left,right;
		Node(int v,Node l,Node r) {
			data=v;left=l;right=r;
		}
//		public void print() {
//			if(left!=null)
//				left.print();
//			System.out.print(data);;
//			if(right!=null)
//				right.print();
//		}
		public void inorder() {
			if(left!=null)
				left.inorder();
			System.out.print(data+" ");
			if(right!=null)
				right.inorder();
		}
		public void preorder() {
			System.out.print(data+" ");
			if(left!=null)
				left.preorder();
			if(right!=null)
				right.preorder();
		}
		public void postorder() {
			if(left!=null)
				left.postorder();
			if(right!=null)
				right.postorder();
			System.out.print(data+" ");
		}
	}
	private Node root;
	public BinaryTree() {
		root=null;
	}
	public void add(int v) {
		if(root==null) {
			root=new Node(v,null,null);
			return;
		}
		Node p=root;
		while(p!=null) {
			if(v<p.data) {
				if(p.left==null) {
					p.left=new Node(v,null,null);
					return;
				}
				else
					p=p.left;
			}
			else {
				if(p.right==null) {
					p.right=new Node(v,null,null);
					return;
				}
				else
					p=p.right;
			}
		}
	}
//	public void print() {
//		root.print();
//	}
	public void inorder() {
		if(root!=null)
			root.inorder();
	}
	public void preorder() {
		if(root!=null)
			root.preorder();
	}
	public void postorder() {
		if(root!=null)
			root.postorder();
	}
	public static void main(String[] args) {
		BinaryTree t=new BinaryTree();
		t.add(3);
		t.add(1);
		t.add(4);
		t.add(1);
		t.add(5);
		t.add(9);
		t.add(2);
		t.inorder(); //1 1 2 3 4 5 9 
		System.out.println();
		t.preorder(); //3 1 1 2 4 5 9 
		System.out.println();
		t.postorder(); //2 1 1 9 5 4 3 
	}
}












