package cracking_coding_interview.chapterOne;

public class AnagramChecker {

	public boolean areAnagram(String string, String string2) {

		if (string.length() != string2.length())
			return false;

		int[] string1Characters = new int[256];
		int uniqueCharacters = 0;

		for (char ch : string.toCharArray()) {
			if (string1Characters[ch] == 0)
				uniqueCharacters++;
			string1Characters[ch]++;

		}

		int wordIsComplete = 0;
		for (char ch : string2.toCharArray()) {
			if (string1Characters[ch] == 0) {
				return false;
			}

			string1Characters[ch]--;
			if (string1Characters[ch] == 0) {
				wordIsComplete++;
				if (wordIsComplete == uniqueCharacters) {
					return true;
				}
			}
		}
		return false;
	}

}
