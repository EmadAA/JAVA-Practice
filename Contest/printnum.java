package Contest;

import java.util.Scanner;

public class printnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 1; i <= 9; i++) {
            int result = N * i;
            System.out.printf("%d x %d = %d%n", N, i, result);
        }
        scan.close();
    }
}
