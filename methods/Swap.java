import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int a =10;
        int b =20;
        String name = "Kunal";
        change(name);
        System.out.println(name);
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);
        System.out.println(a + " " + b);

        int[] arr = {1,2,3,4,5};
        change_val(arr);
        System.out.print(Arrays.toString(arr ));
    }

    private static void change_val(int[] nums) {
        nums[0] = 99;
    }

    private static void change( String naam) {
        naam = "Rahul";
    }

    static void swap (int a,int b ) {
        int temp = a;
        a = b;
        b = temp;

    }
}
