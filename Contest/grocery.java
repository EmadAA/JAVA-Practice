package Contest;

import java.util.Scanner;

public class grocery {
    public static void main(String[] args) { 
        Scanner scan= new Scanner(System.in);
        int item = scan.nextInt();
        int [] groceryItems  = new int[item];
        if (item > 1 || item < 100) {
            for( int i=0; i< item; i++)
        {
            groceryItems[i] =scan.nextInt();
        }
        int sum = 0;
        for( int i=0; i< groceryItems.length; i++)
        {
            sum = sum + groceryItems[i];
        }
System.err.println("Total grocery bill: " + sum);
scan.close();
        }
        
    
    }
}
