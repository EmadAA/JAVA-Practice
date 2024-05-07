public class Solution {

    public static void main(String[] args) {
        class Fibonacci {
            public static void main (String[] args) {
                int n = 6; 
                long result = fibonacci(n);
                System.out.println(result);
            }
        
            public static long fibonacci(int n) {
                if (n <= 1) {
                    return n;
                } else {
                    return fibonacciHelper(n, 0, 1);
                }
            }
        
            private static long fibonacciHelper(int n, long a, long b) {
                if (n == 0) {
                    return a;
                } else {
                    return fibonacciHelper(n - 1, b, a + b);
                }
            }
        }
        
    }
}