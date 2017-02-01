class LinkedList
{
	Node head; // head of the list

	// Linked list node

	static class Node
	{
		int data;
		Node next; 

		//constructor to create a new node
		// next by defualt taken as null

		Node(int d) {data=d;}
	}

	// this fucntion print content of linked list

	public void printList(){
		Node n  = head;

		while(n!=null)
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.print("\n");
	}

	// method to create a simple lionke dlist

	public static void main(String[] args)
	{
		// start with empty list

		LinkedList llist = new LinkedList();

		llist.head = new Node(1);
		Node second  = new Node(2);
		Node third = new Node(3);

		llist.head.next = second ;   // link the first node to the second

		second.next = third; // link second to third


		// System.out.print(llist.head.data);
		llist.printList();

	}
}