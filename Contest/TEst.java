import java.util.Scanner;

public class TEst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the array
            long S = scanner.nextLong(); // Target sum

            long[] A = new long[n]; // Array A
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextLong();
            }

            // Binary search for the smallest X
            long left = 1, right = (long) 1e9, result = -1;
            while (left <= right) {
                long mid = left + (right - left) / 2;
                if (floorSum(A, n, mid) >= S) {
                    result = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.println(result);
        }

        scanner.close();
    }

    // Function to calculate the sum of floors of elements in A divided by X
    private static long floorSum(long[] A, int n, long X) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i] / X;
        }
        return sum;
    }
}
