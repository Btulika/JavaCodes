import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some input:");
        int rollno = scanner.nextInt();
        System.out.println("your roll number is: "+ rollno);
        scanner.close();
    }
}
