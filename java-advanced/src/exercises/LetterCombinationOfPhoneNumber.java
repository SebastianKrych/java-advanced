package exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Example input 23
 * output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 */
public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        Map<Integer, List<String>> phoneNumberToLetterMap = new HashMap<>();
        phoneNumberToLetterMap.put(2, Arrays.asList("a","b","c"));
        phoneNumberToLetterMap.put(3, Arrays.asList("d","e","f"));

//        int phoneNumber = 23;
        int phoneNumber = 3;
        List<String> letters = phoneNumberToLetterMap.get(phoneNumber);
        if (phoneNumber > 0 && phoneNumber <= 9) {
            letters.forEach(l -> System.out.println(l));
        }

        if (phoneNumber > 9 && phoneNumber <= 99) {
            int firstDigit = Integer.valueOf(String.valueOf(phoneNumber).substring(0,1));
            int secondDigit = Integer.valueOf(String.valueOf(phoneNumber).substring(1,2));

            System.out.println(firstDigit);
            System.out.println(secondDigit);

            for (int i = 0; i < 3; i++) {
                String firstLetter = phoneNumberToLetterMap.get(firstDigit).get(i);
                for (int j = 0; j < 3; j++) {
                    String secondLetter = phoneNumberToLetterMap.get(secondDigit).get(j);
                    System.out.println(firstLetter + secondLetter);
                }
            }
        }
    }
}
