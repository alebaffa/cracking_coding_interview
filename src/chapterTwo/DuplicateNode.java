package chapterTwo;

import java.util.HashMap;

public class DuplicateNode {

	NodeUtils utils = new NodeUtils();

	public String removeDuplicate(int[] nodes) {

		Node head = utils.createLinkedList(nodes);

		HashMap<Integer, Boolean> map = new HashMap<>();
		Node result = null;
		Node n = head;
		StringBuffer buffer = new StringBuffer();

		while (n != null) {
			if (!map.containsKey(n.value)) {
				result = n;
				map.put(result.value, true);
				utils.printNode(n, buffer);

			} else {
				result.next = n.next;
			}
			n = n.next;
		}
		return buffer.toString();
	}

}
