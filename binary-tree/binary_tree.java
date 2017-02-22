
// class containing left and right child of current node and key values

class Node
{
	int key;
	Node left , right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

//  A java programm to introduce binary tree

class BinaryTree
{
	// Root of binary tree
	Node root;

	// constructors
	BinaryTree(int key)
	{
		root = new Node(key);
	}

	BinaryTree()
	{
		root =null;
	}

	// BFS travesal or level order tree traversal

	// function to print level order traversal of tree
	void printLevelOrder()
	{
		int h = height(root);
		int i;

		for(i=1;i<=h;i++)
			// System.out.println(i);
			printGivenLevel(root,i);
	}

	// finction to calculate height of the treeint
	int height(Node node)
	{
		if (node ==null)
			return 0;
		else
		{
			// compute heght of each sub tree

			int lheight = height(node.left);
			int rheight = height(node.right);

			//  use the larger one 

			if (lheight > rheight)
			{
				return(lheight+1);
			}
			else
				return (rheight+1);
		}
	}


	// function to print the elements at given level 
	void printGivenLevel(Node node, int level){

		if (node == null){
			return;
		}
		if (level == 1){
			System.out.print(node.key + " ");

		}
		else if(level > 1){
			printGivenLevel(node.left , level-1);
			printGivenLevel(node.right, level-1);
		}
	} 


	// Indorder traversal

	void printInorder(Node node)
	{
		if (node==null)
			return ;

		// first recur on the left sub tree
		printInorder(node.left);

		// print the root
		System.out.print(node.key + " ");

		// traverse to the right sub tree
		printInorder(node.right);
	}


	void printPreorder(Node node)
	{
		if (node==null)
			return ;

		// traverse fromt he rooot first
		System.out.print(node.key+ " ");

		// traverse the left sub tree of the binary tree
		printPreorder(node.left);

		//traverse the right sub tree
		printPreorder(node.right);
	}

	void printPostorder(Node node){
		if(node==null)
			return ;

		// traverse the left sub tree first
		printPostorder(node.left);

		// traverse the right sub tree
		printPostorder(node.right);

		//print the element 
		System.out.print(node.key + " ");
	}

	static int count ;

	int countLeaf(Node node)
	{
		

		if (node ==null){
			return 0 ;
		}

		count  = countLeaf(node.left);
		count = count + countLeaf(node.right);

		if (node.left == null && node.right== null){
			return (count+1);
		}
		else
			return count;
	}

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();

		// create root

		tree.root = new Node(1);

		//  Till now we have created a node with value 1 , left and right child as null

		tree.root.left = new Node(2);
		tree.root.right = new	Node(3);

		// atatch new node to the left and right child

		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		// System.out.println(tree);
		// tree.printInorder(tree.root);
		// System.out.println("\n");
		// tree.printPreorder(tree.root);
		// System.out.println("\n");
		// tree.printPostorder(tree.root);
		System.out.println("\n");
		tree.printLevelOrder();
		System.out.println(tree.countLeaf(tree.root));
	}
}