package cracking_coding_interview.chapterOne;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixZeroTest {

	@Test
	public void test() {
		int[][] matrixExpected = { { 0, 0, 0 }, { 4, 0, 6 }, { 7, 0, 9 } };
		int[][] matrixToConvert = { { 1, 0, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		assertEquals(matrixExpected, new MatrixZero().convert(matrixToConvert));
	}

}
