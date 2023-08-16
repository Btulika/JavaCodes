import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
    //     float num = scanner.nextFloat();
    //     //int num = scanner.nextInt();
    //     System.out.println(num);

    //    // error :  int num = 65.56f;
    //    int num1 = (int)(67.56f); 
    //    System.out.println(num1);
        scanner.close();
        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println(b);

        byte m = 40;
        byte n = 50;
        byte o = 100;
        int p = (m * n) / o;
        System.out.println(p);

    }
    
}
