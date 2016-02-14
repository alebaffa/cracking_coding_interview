package chapterTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeMoverTest {

	@Test
	public void test() {
		int[] nodes = { 1, 2, 3, 4, 5, 6 };
		assertEquals("4", new NodeMover().printNthToLastNode(nodes, 2));
	}

}
