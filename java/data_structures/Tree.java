package data_structures;



/*
 * Tree -> Binary Tree -> Binary Search Tree
 * 
 * 
 */

class Tnode
{
	int value;
	Tnode left;
	Tnode right;
	
	public Tnode(int value) {
		super();
		this.value = value;
	}
	
	
}


class BTree extends Tree
{
	
}

class BSTree extends BTree
{
	
	 public void insert(int o) {
		 
		 this.root = insert(this.root, o);
		
	}

	private Tnode insert(Tnode node, int v) {
		
		if(node == null)
		 {
			 Tnode new_node = new Tnode(v);
			 return new_node;
		 }
		if (node.value < v)
		{
			node.right = insert(node.right, v);
			return node;
		}
		
		node.left = insert(node.left, v);
		return 	node;	
	}
	
}


public class Tree {
	
	Tnode root;
	
	public void printPreOrder()
	{
		
		printNode(this.root, "Pre");
		System.out.println();
		
	}
	
	public void printInOrder()
	{
		
		printNode(this.root, "In");
		System.out.println();
		
	}
	
	public void printPostOrder()
	{
		
		printNode(this.root, "Post");
		System.out.println();
		
	}

	private void printNode(Tnode node, String str) {
		
		if(str.equals("Pre"))
		{
			if(node == null)
				return ;
			System.out.print(node.value+" ");
			printNode(node.left, str);
			printNode(node.right, str);
		}
		
		if(str.equals("In"))
		{
			if(node == null)
				return ;
			
			printNode(node.left, str);
			System.out.print(node.value+" ");
			printNode(node.right, str);
		}
		
		if(str.equals("Post"))
		{
			if(node == null)
				return ;			
			printNode(node.left, str);
			printNode(node.right, str);
			System.out.print(node.value+" ");
		}
			
	}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BSTree t = new BSTree();
		t.insert(20);
		t.insert(10);
		t.insert(22);
		t.insert(4);
		t.insert(15);
		t.insert(23);
		t.insert(80);
		t.insert(90);
		t.printPreOrder();
		t.printInOrder();
		t.printPostOrder();
		

	}

	

}
