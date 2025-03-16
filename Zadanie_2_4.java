public class Zadanie_2_4 {
    public static void wypiszLiczbyNieparzyste(int a, int b) {
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Liczby nieparzyste między " + a + " a " + b + ":");
        wypiszLiczbyNieparzyste(a, b);

        a = 30;
        b = 15;
        System.out.println("Liczby nieparzyste między " + a + " a " + b + ":");
        wypiszLiczbyNieparzyste(a, b);
    }
}
