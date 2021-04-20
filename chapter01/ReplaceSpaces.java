/*
 * Question 1.3
 */
package chapter01;

public class ReplaceSpaces {
    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        int index = trueLength + spaceCount * 2;
        if (trueLength < str.length) {
            str[trueLength] = '\0';
        }
        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }

        System.out.println(String.valueOf(str));
    }

    static int findLastIndex(char[] str) {
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != ' ')
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = findLastIndex(arr) + 1;
        replaceSpaces(arr, trueLength);
    }
}
