package Week3Homework;

/**
 * A class that analyzes words.
 */
public class WordAnalyzerCorrect

{

	public static String word;

	/**
	 * Constructs an analyzer for a given word.
	 * 
	 * @param aWord
	 *            the word to be analyzed
	 */
	public WordAnalyzerCorrect(String word) {
		this.word = word;
	}

	/**
	 * Gets the first repeated character. A character is <i>repeated</i> if it
	 * occurs at least twice in adjacent positions. For example, 'l' is repeated
	 * in "hollow", but 'o' is not.
	 * 
	 * @return the first repeated character, or 0 if none found
	 */
	public static char firstRepeatedCharacter() {
		for (int i = 0; i < word.length() - 1; i++) { // added -1 to
														// word.length()
			char ch = word.charAt(i);
			if (ch == word.charAt(i + 1))
				return ch;
		}
		return '0'; // changed return value from 0 to '0'

	}

	/**
	 * Gets the first multiply occuring character. A character is
	 * <i>multiple</i> if it occurs at least twice in the word, not necessarily
	 * in adjacent positions. For example, both 'o' and 'l' are multiple in
	 * "hollow", but 'h' is not.
	 * 
	 * @return the first repeated character, or 0 if none found
	 */
	public static char firstMultipleCharacter() {
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (find(ch, i) >= 0)
				return ch;
		}
		return '0';  // changed return value from 0 to '0'
	}

	public static int find(char c, int pos) {
		for (int i = pos; i < word.length() - 1; i++) { //added -1 to word.length()
			if (word.charAt(i + 1) == c) { //added +1 to word.charAt(i)
				return c;
			}
		}
		return -1;
	}

	/**
	 * Counts the groups of repeated characters. For example, "mississippi!!!"
	 * has four such groups: ss, ss, pp and !!!.
	 * 
	 * @return the number of repeated character groups
	 */
	public int countRepeatedCharacters() {
		int c = 0;
		for (int i = 0; i < word.length() - 1; i++) {   //changed i from 1 to 0
			if (word.charAt(i) == word.charAt(i + 1)) // found a repetition

			{

				if (word.charAt(i) != word.charAt(i + 2)) // changed word.charAt(i)
					c++;								//changed word.charAt(i + 2)
			}

		}
		return c;
	}
}
