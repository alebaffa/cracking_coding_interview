package chapterTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateNodeTest {

	@Test
	public void test() {
		int[] nodes = {1, 2, 2, 3, 4};
		assertEquals("1 -> 2 -> 3 -> 4", new DuplicateNode().removeDuplicate(nodes));
	}

}
