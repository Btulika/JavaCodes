import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch (empID) {
            case 1 -> System.out.println("Anjali Arora");
            case 2 -> System.out.println("Garima Goel");
            case 3 -> { 
                    switch (department) {
                        case "IT" -> System.out.println("Naman Nanda");
                        case "Economics" -> System.out.println("Sathvika Saxena");
                        case "Maths" -> System.out.println("Karnika Khanna");
                        default -> System.out.println("No department entered");
                    }
            }
            default -> System.out.println(" Invalid Employee ID:");
        }
            input.close();
    }
}
