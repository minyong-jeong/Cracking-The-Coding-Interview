/*
 * Question 1.6
 */

public class CompressString {
	public static String compress(String str) {
		StringBuilder strbuf = new StringBuilder();
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			count++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
				strbuf.append(str.charAt(i));
				strbuf.append(count);
				count = 0;
			}
		}
		String result = strbuf.toString();
		return (result.length() > str.length()) ? str : result;
	}
	
	public static void main(String[] args) {
		System.out.println(compress("aabccccaaa"));
		System.out.println(compress("aabccccaab"));
		System.out.println(compress("abcdefg"));
	}
}
