import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        float num = scanner.nextFloat();
        //int num = scanner.nextInt();
        System.out.println(num);

       // error :  int num = 65.56f;
       int num1 = (int)(67.56f); 
       System.out.println(num1);
        scanner.close();
    }
    
}
