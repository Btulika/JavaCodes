import java.util.Scanner;


public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee name:");
        String empName = sc.next();
        String personalized = myGreet(empName);
        System.out.print(personalized);
    }
    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }

}
