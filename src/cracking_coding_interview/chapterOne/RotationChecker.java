package cracking_coding_interview.chapterOne;

public class RotationChecker {

	private boolean isSubstring(String big, String small) {
		if (big.contains(small))
			return true;
		return false;
	}

	public boolean isRotation(String rightWord, String rotateWord) {
		if (rightWord.length() != rotateWord.length())
			return false;

		int index = 0;
		String toTest = "";
		for (int i = 0; i < rotateWord.length(); i++) {
			char[] ch = rotateWord.toCharArray();
			toTest += String.valueOf(ch[i]);
			if (isSubstring(rightWord, toTest)) {
				index = i;
			}
		}
		String subString1 = rotateWord.substring(0, index);
		String subString = rotateWord.substring(index + 1, rotateWord.length() - 1);
		if (isSubstring(rightWord, subString1) && isSubstring(rightWord, subString))
			return true;
		return false;
	}

}
