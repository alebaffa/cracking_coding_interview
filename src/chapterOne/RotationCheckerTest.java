package chapterOne;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotationCheckerTest {

	@Test
	public void test() {
		assertEquals(true, new RotationChecker().isRotation("waterbottle", "erbottlewat"));
		assertEquals(false, new RotationChecker().isRotation("camera", "macera"));
		assertEquals(true, new RotationChecker().isRotation("apple", "pleap"));
	}

}
