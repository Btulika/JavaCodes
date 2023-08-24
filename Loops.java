import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Print numbers from 1 to 5
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        for(int i=1; i<n+1; i++ ) {
            System.out.println(i);
        }
    }
}
