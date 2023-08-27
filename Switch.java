import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Print fruits present in the basket with their prices
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch(fruit) {
            // case "Mango":
            // System.out.println("Rs 70/kg");
            // break;
            // case "Apple":
            // System.out.println("Rs 120/kg");
            // break;
            // case "Banana":
            // System.out.println("Rs 34/kg");
            // break;
            // default:
            // System.out.println("Out of Stock!");
            case "Mango" -> System.out.println("Rs 70/kg");
            case "Apple" -> System.out.println("Rs 120/kg");
            case "Banana" -> System.out.println("Rs 34/kg");
            default -> System.out.println("Out of stock!");
        }
                input.close();
    }
}
