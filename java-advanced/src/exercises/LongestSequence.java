package exercises;

public class LongestSequence {
    public static void main(String[] args) {
        int[] numbers = {1,1,2,5,5,5,5,7};
        int localLongestSequence = 1;
        int localLongestSequenceNumber = numbers[0];
        int globalLongestSequence = 1;
        int globalLongestSequenceNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (localLongestSequenceNumber == numbers[i]) {
                localLongestSequence++;
                if (localLongestSequence > globalLongestSequence) {
                    globalLongestSequence = localLongestSequence;
                    globalLongestSequenceNumber = localLongestSequenceNumber;
                }
            } else {
                localLongestSequenceNumber = numbers[i];
                localLongestSequence = 1;
            }
        }
        System.out.println("Number " + globalLongestSequenceNumber + ", occurred " + globalLongestSequence + " times.");
    }
}

