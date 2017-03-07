// java programm to demonstrate insert operation in BST

class BinarySearchTree{

	// claa containing left and right child of the current 
	class Node{
		int key;
		Node left, right;

		public Node(int item){
			key = item;
			left = right =null;

		}
	}

	// root to the BST
	Node root;

	// constructor
	BinarySearchTree(){
		root = null;
	}

	// this method will call insertRec

	void insert(int key){
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key){

		// if the tree is empty, return a new node

		if (root == null){
			 root = new Node(key);
			return root;
		}

		// otherwise reocur down the tree 
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if(key > root.key)
			root.right  = insertRec(root.right,key);

		//  return the unchnage value
		return root;
	}

	// This mainly call inorderRec()
	void inorder(){
		inorderRec(root);
	}

	// a function to inorder traversal of BST

	void inorderRec(Node root){
		if (root != null){
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	// programm to test the above function
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		System.out.println(tree.root);
	
	// tree.root;
	tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        // print inorder traversal of the BST
        tree.inorder();
}
	}
	
