public class Zadanie_2_2_2{
    public static int silniaRekurencja(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * silniaRekurencja(n - 1);
    }

    public static void main(String[] args) {
        int number = (int)(Math.random() *10)+1;
        System.out.println("Silnia z " + number + " to: " + silniaRekurencja(number));
    }
}

