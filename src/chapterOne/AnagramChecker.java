package chapterOne;

public class AnagramChecker {

	public boolean areAnagram(String string, String string2) {

		if (string.length() != string2.length())
			return false;

		// the ASCII table is composed by 127 characters x 2 bits = 256 bits
		int[] string1Characters = new int[256];
		int uniqueCharacters = 0;

		// put every character of the 1st string in the array of int, using
		// their ASCII indexes.
		for (char ch : string.toCharArray()) {
			// if the character is not already in the array, increase the
			// counter of unique characters
			if (string1Characters[ch] == 0)
				uniqueCharacters++;
			// in any case, increase the number of characters of the string.
			string1Characters[ch]++;

		}

		int wordIsComplete = 0;
		for (char ch : string2.toCharArray()) {
			// check if the characters of the second string are in the array.
			// if they are not, it means the 2 strings are not anagram.
			if (string1Characters[ch] == 0) {
				return false;
			}

			// if it's found in the array, decrease its counter
			string1Characters[ch]--;
			if (string1Characters[ch] == 0) {
				wordIsComplete++;
				// if the 2 counters are the same, it means the 2 are anagram.
				if (wordIsComplete == uniqueCharacters) {
					return true;
				}
			}
		}
		return false;
	}

}
