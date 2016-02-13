package cracking_coding_interview.chapterOne;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramCheckerTest {

	@Test
	public void test() {
		assertEquals(true, new AnagramChecker().areAnagram("apple", "papel"));
		assertEquals(true, new AnagramChecker().areAnagram("carrot", "tarroc"));
		assertEquals(false, new AnagramChecker().areAnagram("hello", "lllho"));
		assertEquals(false, new AnagramChecker().areAnagram("hello", ""));
	}

}
