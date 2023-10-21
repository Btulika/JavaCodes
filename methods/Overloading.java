public class Overloading {
    public static void main(String[] args) {
//        fun (67);
        fun ("Tulika");
    }

    private static void fun(int i) {
        System.out.println("first one");
        System.out.println(i);
    }

    private static void fun(String name) {
        System.out.println("second one");
        System.out.println(name);
    }

}
