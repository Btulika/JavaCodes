import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Print numbers from 1 to n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        //Using for loop
        // for(int i=1; i<n+1; i++ ) {
        //     System.out.println(i);
        // } 

        //Using while loop
        // int i = 1;
        // while ( i <= n) {
        //     System.out.println(i);
        //     i += 1;
        // }

        //Using do-while Loop
        int i =1;
        do {
            System.out.println(i);
            i++;
        }
        while (i<= n);
    }
}


