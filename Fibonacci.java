import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        int p=0;
        int c=1;
        int count =2;
        while(count<= num){
            int temp = c;
            c = c + p;
            p = temp;
            count++;
        }
        System.out.println(c);
    }
}
