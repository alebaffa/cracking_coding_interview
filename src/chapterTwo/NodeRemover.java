package chapterTwo;

public class NodeRemover {

	NodeUtils utils = new NodeUtils();

	// removeNode deletes the node with value i from the linkedList.
	public String removeNode(int[] nodes, int i) {
		Node head = utils.createLinkedList(nodes);
		Node n = head;
		while (n.value != i) {
			n = n.next;
		}
		n.value = n.next.value;
		n.next = n.next.next;

		StringBuffer buffer = new StringBuffer();
		Node node = head;
		while (node != null) {
			utils.printNode(node, buffer);
			node = node.next;
		}

		return buffer.toString();
	}

}
