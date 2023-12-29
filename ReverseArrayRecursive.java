import java.util.Scanner;

public class ReverseArrayRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N
        int N = scanner.nextInt();

        // Create an array to store the input elements
        int[] arr = new int[N];

        // Input N more elements
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Reverse the array using a recursive function
        reverseArray(arr, 0, N - 1);

        // Print the inverted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Recursive function to reverse the array
    private static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively reverse the subarray
        reverseArray(arr, start + 1, end - 1);
    }
}
