package chapterTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeRemoverTest {

	@Test
	public void test() {
		int[] nodes = {1, 2, 3, 4, 5};
		assertEquals("1 -> 2 -> 3 -> 5", new NodeRemover().removeNode(nodes, 4));
	}

}
