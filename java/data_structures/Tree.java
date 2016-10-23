package data_structures;



/*
 * Tree -> Binary Tree -> Binary Search Tree
 * 
 * 
 */

class Tnode<T>
{
	int value;
	Tnode left;
	Tnode right;
	
	public Tnode(int value) {
		super();
		this.value = value;
	}
	
	
}


class Tree<T> {
	
	Tnode root;	

}


class BTree<T> extends Tree<T>
{
	
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
	
	public void insert(int o) {
		 
		 this.root = insert(this.root, o);
		
	}
	
	private Tnode insert(Tnode node, int v) {
		
		if(node == null)
		 {
			 Tnode new_node = new Tnode(v);
			 return new_node;
		 }
		if (node.left == null)
		{
			node.left = insert(node.left, v);
		}
		else 
		{
			node.right = insert(node.right, v);
		}
		return 	node;	
	}
	
	
	public boolean search(Tnode n)
	{
		return search(this.root,n);
	}

	private boolean search(Tnode root, Tnode n) {
		
		if(root.value == n.value)
		{
			return true;
		}
		if(root.left != null)
		{
			if(search(root.left,n))
			{
				return true;
			}
		}
		if(root.right != null)
		{
			if(search(root.right,n))
			{
				return true;
			}
		}
		return false;
	}
	
	
	public int count()
	{
		return count(this.root);
	}

	private int count(Tnode root) {
		
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return 1;
		return count(root.left) + count(root.right);
	}
	
}

class BSTree<T> extends BTree<T>
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
