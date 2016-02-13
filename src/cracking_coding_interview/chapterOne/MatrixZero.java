package cracking_coding_interview.chapterOne;

public class MatrixZero {

	private int[][] clone(int[][] matrix) {
		int[][] matrixResult = new int[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrixResult[i][j] = matrix[i][j];
			}
		}
		return matrixResult;
	}

	public int[][] convert(int[][] matrixToConvert) {

		int[][] matrixResult = clone(matrixToConvert);

		for (int i = 0; i < matrixToConvert.length; i++) {
			for (int j = 0; j < matrixToConvert.length; j++) {
				if (matrixToConvert[i][j] == 0) {
					zerofyRow(matrixResult, i);
					zerofyColumn(matrixResult, j);
				}
			}
		}

		return matrixResult;
	}

	private void zerofyRow(int[][] matrix, int row) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[row][i] = 0;
		}
	}

	private void zerofyColumn(int[][] matrix, int column) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][column] = 0;
		}
	}

}
