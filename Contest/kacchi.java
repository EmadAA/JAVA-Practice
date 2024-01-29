package Contest;

import java.util.Scanner;

public class kacchi {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {

            int N = scanner.nextInt();
            int packs = N / 250;
            System.out.println(packs);
        }
        scanner.close();
    }
}
