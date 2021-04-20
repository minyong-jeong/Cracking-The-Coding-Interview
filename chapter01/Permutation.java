/*
 * Question 1.2
 */
package chapter01;

public class Permutation {
	public static boolean permutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int[] charCount = new int[128];
		for (int i = 0; i < str1.length(); i++) {
			int c = str1.charAt(i);
			charCount[c]++;
		}
		for (int i = 0; i < str2.length(); i++) {
			int c = str2.charAt(i);
			charCount[c]--;
			if (charCount[c] < 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String str1 = "ababdf";
		String str2 = "fbaabd";
		System.out.println(str1 + " <-> " + str2 + ": " + permutation(str1, str2));

		str1 = "abddbd";
		str2 = "abbddb";
		System.out.println(str1 + " <-> " + str2 + ": " + permutation(str1, str2));
	}
}
