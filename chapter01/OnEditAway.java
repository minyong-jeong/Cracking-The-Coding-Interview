/*
 * Question 1.5
 */

public class OnEditAway {
	public static boolean onEditAway(String str1, String str2) {
		if (str1.length() == str2.length()) {
			return onEditReplace(str1, str2);
		} else if (str1.length() - 1 == str2.length()) {
			return onEditInsert(str1, str2);
		} else if (str1.length() + 1 == str2.length()) {
			return onEditInsert(str2, str1);
		}
		
		return true;
	}
	
	public static boolean onEditReplace(String str1, String str2) {
		boolean foundDiff = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				if (foundDiff) {
					return false;
				}
				foundDiff = true;
			}
		}
		return true;
	}
	
	public static boolean onEditInsert(String str1, String str2) {
		int index1 = 0;
		int index2 = 0;
		int str1Len = str1.length();
		int str2Len = str2.length();
		
		while (index1 < str1Len && index2 < str2Len) {
			if (str1.charAt(index1) != str2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index1++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(onEditAway("pale", "ple"));
		System.out.println(onEditAway("pales", "pale"));
		System.out.println(onEditAway("pale", "bale"));
		System.out.println(onEditAway("pale", "bake"));
	}
}