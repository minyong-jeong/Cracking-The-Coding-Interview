/*
 * Question 1.1
 */

public class IsUniqueChars {
	public static boolean isUniqueChars(String str) {
		boolean[] ascii = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			if (ascii[c]) {
				return false;
			}
			ascii[c] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		String[] words = { "apple", "banana", "grape", "melon" };
		for (String str : words) {
			System.out.println(str + ": " + isUniqueChars(str));
		}
	}
}
