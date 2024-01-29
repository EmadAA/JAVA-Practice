// Name: Emad Uddin Adil

import java.util.Scanner;

public class adil {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        char section = scan.next().charAt(0); 
        if (section == 'A' || section == 'B' || section == 'E' || section == 'a' || section == 'b' || section == 'e') {
            System.out.println("JIM Sir");
        } else if (section == 'C' || section == 'D' || section == 'c' || section == 'd') {
            System.out.println("JAC Sir");
        } else {
            System.out.println("Invalid input");
        }
        
    }
}