package chapterTwo;

public class NodeUtils {

	/**
	 * createLinkedList creates a linked list of nodes using the int values in
	 * input. It returns the head node.
	 */
	public Node createLinkedList(int[] nodes) {
		Node head = new Node(nodes[0]);
		for (int i = 1; i < nodes.length; i++) {
			appendToTail(head, nodes[i]);
		}
		return head;
	}

	/**
	 * printNode prints the values of the linked list of nodes. Ex: 1 -> 2 -> 3
	 * -> 4
	 */
	public void printNode(Node n, StringBuffer buffer) {
		if (n.next != null)
			buffer.append(n.value + " -> ");
		else
			buffer.append(n.value);
	}

	/**
	 * appendToTail creates a new Node using the value in input and appends it
	 * to the tail of the linked list of nodes. It needs the head to start its
	 * move in the linked list.
	 */
	void appendToTail(Node head, int value) {
		Node end = new Node(value);
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

}
