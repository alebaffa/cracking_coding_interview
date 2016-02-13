package cracking_coding_interview.chapterOne;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpaceReplacerTest {

	@Test
	public void test() {
		assertEquals("ci%20ao", new SpaceReplacer().replaceWhiteSpaceWithString("ci ao"));
		assertEquals("ciao%20mamma%20guarda%20come",
				new SpaceReplacer().replaceWhiteSpaceWithString("ciao mamma guarda come"));
	}

}
