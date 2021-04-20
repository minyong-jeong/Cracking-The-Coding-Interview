/*
 * Question 1.4 
 */
package chapter01;

import java.util.HashMap;
import java.util.Map;

public class PermutationOfPalindrome {
    public static boolean isPermutationOfPalindrome(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (key > 'a' && key < 'z') {
                if (map.containsKey(key))
                    map.put(key, map.get(key) + 1);
                else
                    map.put(key, 1);
            }
        }

        boolean checkMaxOneOdd = true;
        boolean foundOdd = false;
        for (char key : map.keySet()) {
            if (map.get(key) % 2 == 1) {
                if (foundOdd) {
                    checkMaxOneOdd = false;
                    break;
                }
                foundOdd = true;
            }
        }

        return checkMaxOneOdd;
    }

    public static void main(String[] args) {
        String str = "toco cat";
        System.out.println(isPermutationOfPalindrome(str));
    }
}
