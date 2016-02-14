package chapterTwo;

public class NodeMover {

	NodeUtils utils = new NodeUtils();

	public String printNthToLastNode(int[] nodes, int i) {
		Node head = utils.createLinkedList(nodes);
		Node n1 = head;
		Node n2 = head;

		for (int j = 0; j < i; j++) {
			n2 = n2.next;
		}
		while (n2.next != null) {
			n1 = n1.next;
			n2 = n2.next;
		}
		return String.valueOf(n1.value);
	}

}
