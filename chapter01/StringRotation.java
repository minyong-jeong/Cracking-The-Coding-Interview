/*
 * Question 1.9
 */
package chapter01;

public class StringRotation {
    public static boolean isSubString(String str1, String str2) {
        return str1.contains(str2);
    }
    
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() > 0 && s1.length() != s2.length()) return false;
        
        String s1s1 = s1 + s1;
        return isSubString(s1s1, s2);
    }
    
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println(isRotation(str1, str2));
    }
}
