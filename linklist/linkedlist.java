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


	// this function insert node at the given place

	public void insertAfter(Node prev_node, int new_data){

		if(prev_node== null ){
			System.out.println("The given previous nopde can not be null");
			return;
		}

		Node new_node  = new Node(new_data);

		new_node.next = prev_node.next;

		prev_node.next = new_node;

	}

	// append finction insert the new node at the end

	public void append(int new_data){

		Node new_node = new Node(new_data);

		if (head == null){
			head = new Node(new_data);
			return;
		}

		new_node.next = null;

		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}

		temp.next  = new_node;

		return;
	}

	// delete the key from the linked list

	public void deleteNode(int key){
		if(head != null && head.data == key){
			head  = head.next;
			return;
		}

		Node current_node = head;

		Node prev_node=null;

		while(current_node != null && current_node.data !=key){

			System.out.println(current_node.data);
			prev_node = current_node;
			current_node = current_node.next;
		}

		if (current_node == null ){
			System.out.print("key is not present in the list");

		}

		prev_node.next = current_node.next;


	}

	// This fucntion is the part of linked list class. It insert the new node at front of linked list
	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	// delete node at position
	public void deleteNodePos(int position){

		Node current_node = head , prev_node=null; 

		if(position<0){
			System.out.print("position should be > or =  zero");
			return;
		}
		else if(position==0){
			head  = current_node.next;
		}
		else{
			int count =0;
			while(current_node!=null && count<position){
				count++;
				prev_node = current_node;
				current_node = current_node.next;
			}

			if (current_node == null){
				System.out.print("position can not be greater than the number of elements in the list");
				return;
			}

			prev_node.next = current_node.next;
		}

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

		llist.push(44);

		llist.insertAfter(second, 67);
		llist.append(99);
		// System.out.print(llist.head.data);

		llist.deleteNodePos(0); 
		llist.printList();

	}
}