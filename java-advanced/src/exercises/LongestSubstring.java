package exercises;

public class LongestSubstring {
    public static void main(String[] args) {
        String text = "abcazbxcvbnm";

        String localLongestSubstring = text.substring(0,1);
        int localLongestSubstringSize = 1;
        String globalLongestSequence = text.substring(0,1);
        int globalLongestSequenceSize = 1;
        int iteration = 0;

        for (int i = 1; i < text.length(); i++) {
            String character = text.substring(i, i + 1);
            if (!localLongestSubstring.contains(character)) {
                localLongestSubstring = localLongestSubstring + character;
                localLongestSubstringSize++;
                if (localLongestSubstringSize > globalLongestSequenceSize) {
                    globalLongestSequence = localLongestSubstring;
                    globalLongestSequenceSize = localLongestSubstringSize;
                }
            } else {
                iteration+=1;
                i = iteration;
                localLongestSubstring = text.substring(i, i + 1);
                localLongestSubstringSize = 1;
            }
        }
        System.out.println(globalLongestSequence + ", size = " + globalLongestSequenceSize);
    }
}
