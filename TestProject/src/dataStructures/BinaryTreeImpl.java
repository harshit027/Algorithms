package dataStructures;

public class BinaryTreeImpl {

	public static void main(String args[])
	{
		BinaryTree tree= new BinaryTree(20);
		BinaryTree left= new BinaryTree(10);
		BinaryTree right= new BinaryTree(30);
		BinaryTree n1= new BinaryTree(40);
		BinaryTree n2= new BinaryTree(50);
		BinaryTree n3= new BinaryTree(60);
		BinaryTree n4= new BinaryTree(70);
		BinaryTree n5= new BinaryTree(80);
		BinaryTree n6= new BinaryTree(90);
		
		tree.setLeft(left);
		tree.setRight(right);
		
		
		left.setLeft(n1);
		left.setRight(n2);
		
		right.setLeft(n3);
		right.setRight(n4);
		
		n1.setLeft(n5);
		n1.setRight(n6);
		
		//tree.BFS(tree);
		//tree.getAncestors(n6, tree);
		tree.traverse(tree);
	    //System.out.println("\n"+tree.getHeight(tree));
		/*tree.mirror(tree);
		System.out.println();
		tree.traverse(tree);*/
		//System.out.println(tree.isBinarySearchTree(tree, Integer.MIN_VALUE, Integer.MAX_VALUE));
	    System.out.println("\n"+tree.LCA(tree, 50, 60).getKey());
	}
}
class BinaryTree
{
	private int key;
	private BinaryTree left,right;
	
	BinaryTree(int key)
	{
		this.key=key;
		left=null;
		right=null;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
	public void traverse(BinaryTree root)
	{
		if(root==null)
			return;
		traverse(root.getLeft());
		System.out.print(root.getKey()+"->");
		traverse(root.getRight());
	}
	
	public boolean isLeafNode()
	{
		return this.getLeft()== null && this.getRight()==null;
	}
	
	public void printPaths(BinaryTree root)
	{
		if(root==null)
			return;
		
		System.out.print(root.getKey()+"->");
		if(root.isLeafNode())
		{
			System.out.println("\n");
		}
		
		printPaths(root.getLeft());
		printPaths(root.getRight());
		
	}
	
	public int getHeight(BinaryTree root)
	{
		if(root ==null)
			return 0;
		
		return 1+ Math.max(getHeight(root.getLeft()), getHeight(root.getRight()));
	}
	
	public void BFS(BinaryTree root)
	{
		for(int i=1;i<root.getHeight(root);i++)
			BFSUtil(root,i);
	}
	public void BFSUtil(BinaryTree root, int level)
	{
		if(root == null)
			return;
		
		if(level==1)
			System.out.print(root.getKey()+"->");
		else
			if(level>1)
			{
				BFSUtil(root.getLeft(),level-1);
				BFSUtil(root.getRight(),level-1);
			}
	}
	
	public boolean getAncestors(BinaryTree node, BinaryTree root)
	{
		if(root == null)
			return false;
		
		if(node.getKey()==root.getKey() )
		{
			return true;
		}
		
		if(getAncestors(node, root.getLeft()) || getAncestors(node,root.getRight()))
		{
			System.out.println(root.getKey()+"->");
			return true;
		}
		
		return false;
		
		
	}
	
	public void mirror(BinaryTree root)
	{
		if(root==null)
			return ;
		
		mirror(root.getLeft());
		mirror(root.getRight());
		
		BinaryTree tempNode=root.getLeft();
		root.setLeft(root.getRight());
		root.setRight(tempNode);
	}
	
	public boolean isBinarySearchTree(BinaryTree root, int min, int max)
	{
		if(root==null)
			return true; //empty tree is binary
		if(root.getKey() < min || root.getKey()>max)
			return false;
		
		return isBinarySearchTree(root.getLeft(),min,root.getKey()-1) && 
		       isBinarySearchTree(root.getRight(),root.getKey()+1,max);
		
	}
	
	public BinaryTree LCA(BinaryTree root, int key1, int key2)
	{
		if(root==null)
			return null;
		
		if(root.getKey()==key1 || root.getKey()==key2)
			return root;
		
		BinaryTree LCAleft=LCA(root.getLeft(),key1,key2);
		BinaryTree LCAright=LCA(root.getRight(),key1,key2);
		if(LCAleft!=null && LCAright!=null)
			return root;
		
		if(LCAleft!=null)
			return LCAleft;
		else
			return LCAright;
		
	}
}
