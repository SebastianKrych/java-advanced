package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * "?" - single character
 * "*" - sequence of character
 */
public class WildcardMatching {
    public static void main(String[] args) {
        String text1 = "ba";
        String text2 = "baa";
        String text3 = "2a";

        String searchText = "?a";//example ba,ca

        checkSingleWildcard(text1, searchText);

    }

    private static void checkSingleWildcard(String textToValidate, String searchText) {
        System.out.println("Text to validate = " + textToValidate);

        String searchTextToRegex = searchText.replaceAll("\\?","[a-z]");
        searchTextToRegex = searchTextToRegex.replace("\\","");
        System.out.println("regular expression = " + searchTextToRegex);

        Pattern pattern = Pattern.compile(searchTextToRegex);
        Matcher m = pattern.matcher(textToValidate);

        if (m.matches()) {
            System.out.println("match");
        }
    }
}
