package exercises;

import java.util.Stack;

/**
 * All characters are the same example aaa
 * oooabbaoo
 * accca
 * abccba
 *
 * use reverse string
 *
 * 1. biore pierwszy znak i porównuje z natępnym
 * jezeli jest taki sam to OK - do pominiecia?
 * 2.pobieram 2 znaki, porównuje je z odwróconą wersją
 * 3. pobieram 3 znaki i
 *
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        print("abbahh");
    }
    private static void print(String textToCheck) {
        String text = textToCheck;
        int startCompareSize = 2;
        int textLength = text.length();

        String longestPalindromeText = "";
        int longestPalindromeTextLength = 0;

        //first iteration starts from 0
        //last iteration starts from second from the end
        for (int i = 0; i < textLength - 1 ; i++) {
            for (int j = startCompareSize; j <= textLength; j++) {
                int end = i + j;
                if (end > textLength) {
                    break;
                } else {
                    String substring = text.substring(i, end);
//                    System.out.println(substring);
                    if (substring.equals(reverse(substring))) {
//                        System.out.println("is palindrome");
                        int substringLength = substring.length();
                        if (substringLength > longestPalindromeTextLength) {
                            longestPalindromeTextLength = substringLength;
                            longestPalindromeText = substring;
                        }
                    }
                }
            }
        }

        System.out.println("Longest palindrome substring is = " + longestPalindromeText);
    }

    private static String reverse(String input) {
        String reversedInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput += input.charAt(i);
        }
        return reversedInput;
    }
}
