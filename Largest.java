import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        //Find the largest of all 3 numbers
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();
        //Naive Approach
        // if (a > b && a > c) {
        //     System.out.println(a+ " is the largest");
        // } else if (b > a && b > c) {
        //     System.out.println(b+ " is the largest");
        // } else
        // System.out.println(c+ " is the largest");
        //Another Approach
        // int max =a;
        // if (max < b) {
        //     max = b;
        // }
        // if (max < c) {
        //     max = c;
        // }
        //Smart Approach
        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);
    }
}
