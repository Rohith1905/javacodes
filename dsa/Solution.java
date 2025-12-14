import java.util.Arrays;
import java.util.Random;

public class Solution {
    // Function to sort the array
    public void sortArray(int[] values) {
        Arrays.sort(values);
        System.out.println(Arrays.toString(values)); // Print the sorted array
    }

    public static void main(String[] args) {
        // Create a Random object
        Random rand = new Random();

        int[] values = new int[10]; // Change the size to 10

        // Generate random values in the range of 0 to 999
        for (int i = 0; i < values.length; i++) {
            values[i] = rand.nextInt(1000); // Fill the array with random numbers (0 to 999)
        }

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Get starting time
        long start = System.nanoTime();

        // Call the function to sort the array
        solution.sortArray(values);

        // Get ending time
        long stop = System.nanoTime();

        // Calculate duration in seconds
        double duration = (stop - start) / 1_000_000_000.0; // Convert to seconds

        // Print the time taken in seconds with 6 decimal places
        System.out.printf("Time taken to sort: %.6f seconds%n", duration);
    }
}