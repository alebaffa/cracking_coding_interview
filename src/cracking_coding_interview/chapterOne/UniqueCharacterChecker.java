package cracking_coding_interview.chapterOne;

public class UniqueCharacterChecker {

	public Object containsUniqueChars(String string) {
		boolean[] charOfArray = new boolean[256];
		for (char ch : string.toCharArray()) {
			if (charOfArray[ch])
				return false;
			charOfArray[ch] = true;
		}
		return true;
	}

}
