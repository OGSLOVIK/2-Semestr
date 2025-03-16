public class Zadanie_2_1_1{
    public static int silniaPetla(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Silnia z " + n + " to: " + silniaPetla(n));
    }
}
