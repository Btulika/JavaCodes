import java.sql.SQLOutput;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        funn(1,43,2,5,67,8,90,100);
    }

    private static void funn(int ... a) {
        System.out.println(Arrays.toString(a));
    }
}
