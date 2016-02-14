package chapterOne;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharacterCheckerTest {

	@Test
	public void test() {
		UniqueCharacterChecker checker = new UniqueCharacterChecker();
		assertEquals(false, checker.containsUniqueChars("test"));
		assertEquals(true, checker.containsUniqueChars("abcd"));
	}

}
