import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                // Take input from user does not press x or X
                int ans = 0;
                while (true) {
                    System.out.println("Enter the operation you want to perform");
                    char op = input.next().trim().charAt(0);
                    if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                        // input two numbers
                        System.out.println("Enter two numbers:");
                        int n1 = input.nextInt();
                        int n2 = input.nextInt();
                        if (op == '+') {
                            ans = n1 + n2;
                        }
                        if (op == '-') {
                            ans = n1 - n2;
                        }
                        if (op == '*') {
                            ans = n1 * n2;
                        }
                        if (op == '/') {
                            if (n2 != 0) {
                                ans =  n1 / n2;
                            }
                        }
                        if (op == '%') {
                            ans = n1 % n2;
                        }
                    }
                    else if (op == 'x' || op == 'X') {
                    System.out.println("Program Over xD");
                    break;
                }
                else {
                System.out.println("User has entered invalid operation");
                input.close();
            }
            System.out.println(ans);
        }
    }
}
