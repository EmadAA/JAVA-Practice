package Contest;

import java.util.Scanner;

public class triangle {
     public static void main(String[] args) { 
        Scanner scan= new Scanner(System.in);
        int row = scan.nextInt();
for(int i=row; i>0; i--)
{
    for(int j=i; j>0; j--)
    {
        
        System.out.print(j);
        
    }
    System.out.println();
    
}

scan.close();
    
    }
}
