public class Main {
    public static void main(String[] args) {
        task2();
    }
    public static void task1(){
        int i = 1;
        int end = 30;
        int n = 3;
        int m = 5;
        for (; i <= end; i++) {
            System.out.print(i + ": ");
            if (i % n == 0 && i % m == 0) {
                System.out.print( "ping pong");
            } else if (i % n == 0) {
                System.out.print( "ping");
            } else if (i % m == 0) {
                System.out.print( "pong");
            }
            System.out.print("\n");
        }
    }
    public static void task2() {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}