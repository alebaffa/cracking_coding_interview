package chapterTwo;

import java.util.HashMap;

public class DuplicateNode {

	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

		void appendToTail(int value) {
			Node end = new Node(value);
			Node n = this;
			while (n.next != null) {
				n = n.next;
			}
			n.next = end;
		}
	}

	private Node createLinkedList(int[] nodes) {
		Node head = new Node(nodes[0]);
		for (int i = 1; i < nodes.length; i++) {
			head.appendToTail(nodes[i]);
		}
		return head;
	}

	private void printNode(Node result, Node n, StringBuffer buffer) {
		if (n.next != null)
			buffer.append(result.value + " -> ");
		else
			buffer.append(result.value);
	}

	public String removeDuplicate(int[] nodes) {

		Node head = createLinkedList(nodes);

		HashMap<Integer, Boolean> map = new HashMap<>();
		Node result = null;
		Node n = head;
		StringBuffer buffer = new StringBuffer();

		while (n != null) {
			if (!map.containsKey(n.value)) {
				result = n;
				map.put(result.value, true);
				printNode(result, n, buffer);

			} else {
				result.next = n.next;
			}
			n = n.next;
		}
		return buffer.toString();
	}

}
