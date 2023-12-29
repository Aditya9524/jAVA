import java.util.Scanner;

public class SortZerosAndOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N
        int N = scanner.nextInt();

        // Create an array to store the sequence
        int[] sequence = new int[N];

        // Input the sequence
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }

        // Sort the sequence
        int[] sortedSequence = sortZerosAndOnes(sequence);

        // Print the sorted sequence
        for (int num : sortedSequence) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Function to sort 0s and 1s
    private static int[] sortZerosAndOnes(int[] arr) {
        int count0 = 0;
        int count1 = 0;

        // Count the number of 0s and 1s
        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        // Create a new array with the sorted order
        int[] sortedArr = new int[arr.length];
        int index = 0;

        // Add 0s
        for (int i = 0; i < count0; i++) {
            sortedArr[index++] = 0;
        }

        // Add 1s
        for (int i = 0; i < count1; i++) {
            sortedArr[index++] = 1;
        }

        return sortedArr;
    }
}
