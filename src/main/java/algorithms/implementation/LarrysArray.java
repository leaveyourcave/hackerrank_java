package algorithms.implementation;

import java.util.Scanner;

public class LarrysArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfCases = in.nextInt();

        for (int i = 0; i < numberOfCases; i++) {
            int size = in.nextInt();
            int[] sequence = new int[size];

            for (int j = 0; j < size; j++) {
                sequence[j] = in.nextInt();
            }

            System.out.println(determineIfSolvable(sequence));
        }
    }

    static String determineIfSolvable(int[] sequence) {
        int inversionsCount = 0;

        for (int alreadySortedIndex = 1; alreadySortedIndex < sequence.length; alreadySortedIndex++) {
            int i = alreadySortedIndex - 1;
            int element = sequence[alreadySortedIndex];

            while (i >= 0 && element < sequence[i]) {
                sequence[i + 1] = sequence[i];
                sequence[i] = element;
                i--;

                inversionsCount++;
            }
        }

        return isSolvable(inversionsCount);
    }

    private static String isSolvable(int inversionsCount) {
        return isEven(inversionsCount) ? "YES" : "NO";
    }

    private static boolean isEven(int inversionsCount) {
        return inversionsCount % 2 == 0;
    }
}
