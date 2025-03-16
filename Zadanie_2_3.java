public class Zadanie_2_3 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci na pozycji " + n + " to: " + fibonacci(n));
    }
}